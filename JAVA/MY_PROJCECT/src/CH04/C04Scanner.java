package CH04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이름을 입력하세요? 홍길동
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		
		// 홍길동 님의 나이를 입력하세요? 35
		System.out.printf("%s 님의 나이를 입력하세요 : ", name);
		int age = sc.nextInt();
		sc.nextLine();
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		System.out.printf("%s 님의 주소를 입력하세요 : ", name);
		String addr = sc.nextLine();
		
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다
		System.out.printf("%s 님의 나이는 %s세 주소는 %s 입니다.", name , age , addr);
		
		
		sc.close();

	}

}