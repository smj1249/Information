package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/login.do")
public class LoginRedirectFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		// request전
		System.out.println("[FILTER] REDIRECT FILTER START");
		chain.doFilter(req, resp);
		System.out.println("[FILTER] REDIRECT FILTER END");
		// response 후
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		String method = request.getMethod();
		HttpSession session = request.getSession();
		String role = (String)session.getAttribute("role");
		if(method.contains("POST") && (role!=null)) {
			System.out.println("[FILTER] 로그인된 상태 확인! role : " + role);
		}
		
		System.out.println("[FILTER] REDIRECT FILTER END");

		
	}
	
	// FILETER URL : login.do
	// 로그인 성공시 redirect 경로를 role별로 해줍니다
	// Role_ADMIN -> /admin_main 으로 리다이렉트
	// Role_MANAGER -> /manager_main 으로 리다이렉트
	// Role_USER -> /user_main 으로 리다이렉트
}
