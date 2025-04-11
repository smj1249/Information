package Filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Type.Role;

public class PermissionFilter implements Filter{
	
	//URL : Permission Value
	private Map<String,Role> pageGradeMap = new HashMap();
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//
		String projectPath = filterConfig.getServletContext().getContextPath();
//		/admin_main 	필요한 권한값(3) - ROLE_ADMIN 
//		/manager_main 	필요한 권한값(2) - ROLE_MANAGER
//		/user_main 		필요한 권한값(1) - ROLE_USER
//						
		pageGradeMap.put(projectPath+"/admin_main", Role.ROLE_ADMIN); //3
		pageGradeMap.put(projectPath+"/manager_main", Role.ROLE_MANAGER); //2
		pageGradeMap.put(projectPath+"/user_main", Role.ROLE_USER); //1
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
	
		HttpSession session = request.getSession();
		
		String myRole = (String)session.getAttribute("role");
		if(myRole==null) {
			response.sendRedirect(request.getContextPath()+"/login.do?msg=not authenticated...");
			return ;
		}
		//
		Role my=null;
		switch(myRole)
		{
			case "ROLE_USER":
				my = Role.ROLE_USER;		//1
				break;
			case "ROLE_MANAGER":
				my = Role.ROLE_MANAGER;		//2
				break;			
			case "ROLE_ADMIN":
				my = Role.ROLE_ADMIN;		//3
				break;
			default : 
				my = Role.ROLE_ANONYMOUS;	//0
				break;
		}
		
		//Page Role Value 꺼내기
		String requestUri = request.getRequestURI();	// /project/admin_main..
		Role pageRole =  pageGradeMap.get(requestUri);
		
		System.out.printf("URL : %s,MyRole : %d, PageRole : %d\n",requestUri,my.ordinal(),pageRole.ordinal());
		
		if(my.ordinal()<pageRole.ordinal()) {
			throw new ServletException("해당 권한으로는 접근이 불가능한 페이지입니다.");
		}
		
		System.out.println("[FILTER] Perm Filter start..");
		chain.doFilter(req, resp);
		System.out.println("[FILTER] Perm Filter end..");
	}

}
