package CH08;

class TV{
	String brand;
	int inch;
	int year;
//	TV(char brand, int inch, int year){
//		this.brand=brand;
//		this.inch=inch;
//		this.year=year;
//	}
	public TV(String brand, int inch, int year) {
		this.brand=brand;
		this.inch=inch;
		this.year=year;
	}
	public void show() {
		System.out.println(brand+"에서 만든"+year+"년 형"+inch+"인치 TV");
	}
}


public class C09Ex {
	public static void main(String[] args) {
		TV myTV=new TV("LG",32,2017);	// LG에서 만든 2017년 형 32인치 TV
		myTV.show();
	}
	//package Ch08Ex;
	//
	//public class C00문제 {
//		--------------------------------------------
//		문제 - 이것이자바다
//		--------------------------------------------
//		https://scksk.tistory.com/6
//----------------------------------------------
//	추가(명품자바)
//	--------------------------------------------
//	https://security-nanglam.tistory.com/213
	
//		클래스 기본문제
//		1~7번 확인하기 
	//
//		12번-16번 확인하기
	//
//		--------------------------------------------
//		--추가(명품자바)
//		--------------------------------------------
//		https://security-nanglam.tistory.com/213
	//
	//
//		--------------------------------------------
//		--추가
//		--------------------------------------------
//		https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
	//
}