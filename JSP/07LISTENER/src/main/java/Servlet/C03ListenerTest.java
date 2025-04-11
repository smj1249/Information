package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/app/add","/app/replace","/app/remove","/session/attr/replace","/session/attr/remove"})
public class C03ListenerTest extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("[SERVLET] C03ListenerTest service");
		String uri = req.getRequestURI();
		HttpSession session = req.getSession(false);
		if(uri.contains("/session/remove")) {
			// 세션제거
			session.invalidate();
		}else if(uri.contains("/app/replace")) {
			req.getServletContext().setAttribute("CTX_KEY", "CTX_VALUE_2");
		}else {
			req.getServletContext().removeAttribute("CTX_KEY");
		}
	}
}
