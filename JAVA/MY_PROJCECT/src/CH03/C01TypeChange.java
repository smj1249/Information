package CH03;

public class C01TypeChange {
	public static void main(String[] args) {
		// (자료)형변환
		// 연산시 일치하지 않는 자료형을 일치시키는 작업
		
		// 자동형변환(암시적 형변환) : 컴파일러에 의해 자동 형변환
		// 강제형변환(명시적 형변환) : 프로그래머에 의해 강제 형변환
		
		// 자동형변환(=)
		// '변수 연산처리'시 범위가 넓은 공간에 작은 값이 대입되는 경우
		// '리터럴 상수 연산처리'시 리터럴 값에 따른 형변환 여부 결정
		// ex )
		// byte > short,char > int > long > float > double
		
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue: " + intvalue);
		
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println("가 의 유니코드: " + intvalue);
		
		int longvalue = 50;
		long longvalue1 = intvalue;
		System.out.println("longvalue: " + longvalue1);
		
		longvalue = 100;
		float floatValue = longvalue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		
		
		
	}
}
