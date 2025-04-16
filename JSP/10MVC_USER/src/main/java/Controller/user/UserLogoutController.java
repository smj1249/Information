package Controller.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.SubController;
import Domain.Service.UserServiceImpl;

public class UserLogoutController implements SubController {

	private UserServiceImpl userService;

	public UserLogoutController() throws Exception {
		userService = UserServiceImpl.getInstance();
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("[SC] UserLogoutController execute...");

		try {
			HttpSession session = req.getSession(false); // false: 세션 없으면 null 리턴

			// 로그인 상태 확인
			if (session == null || session.getAttribute("isAuth") == null || !(Boolean) session.getAttribute("isAuth")) {
				req.setAttribute("message", "로그인 상태가 아닙니다.");
				req.getRequestDispatcher("/WEB-INF/view/user/login.jsp").forward(req, resp);
				return;
			}

			// 로그아웃 처리
			Map<String, Object> result = userService.logout(session);

			// 로그아웃 후 리다이렉트 또는 포워딩
			if ((Boolean) result.get("isLogout")) {
				// 로그아웃 성공 시 세션은 이미 무효화되었으므로 새 세션에 메시지 저장
				HttpSession newSession = req.getSession(true);
				newSession.setAttribute("message", result.get("message"));
			} else {
				// 실패 시 기존 세션에 메시지
				session.setAttribute("message", "로그아웃 실패");
			}

			resp.sendRedirect(req.getContextPath() + "/login.do");

		} catch (Exception e) {
			exceptionHandler(req, e);
			try {
				req.getRequestDispatcher("/WEB-INF/view/user/error.jsp").forward(req, resp);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	private void exceptionHandler(HttpServletRequest req, Exception e) {
		req.setAttribute("status", false);
		req.setAttribute("message", e.getMessage());
		req.setAttribute("exception", e);
	}
}
