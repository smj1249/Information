package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
	//서브컨트롤러 저장 자료구조("/endPoint":서브컨트롤러객체)
	private Map<String,SubController> map = new HashMap();
	
	//싱글톤
	private static FrontController instance;
	private FrontController() {
		System.out.println("[FC] FrontController init..");
		init();
	}
	public static FrontController getInstance() {
		if(instance==null)
			instance = new FrontController();
		return instance;
	}
	//초기화
	private void init() {
		// 인증요청 API(ENDPOINT : 서브컨트롤러객체 저장)
		map.put("/user", new UserController());
		
		// 도서요청 API
		map.put("/book", new BookController());
	}
	
	//View로부터 전달하는 요청 처리 
	public Map<String,Object> execute (Map<String,Object> params)
	{
		System.out.println("[FC] execute invoke....");
		String endPoint =(String)params.get("endPoint"); //사용자의 요청EP를 확인(/book,/user)
		SubController controller =  map.get(endPoint);	//요청사항을 처리할 SubController get
		return controller.execute(params);		 
	}
}


			
