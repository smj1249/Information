package CH06;

import java.util.Scanner;

public class C01IF {
	public static void main(String[] args) {
		// ---------------------
		// 단순 IF
		// ---------------------

//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		
//		if(age < 8)
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("두번째 IF 코드 블럭 종료..");
//		
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();

		// ---------------------
		// IF-ELSE
		// ---------------------

//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();

		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요.
		// 3의 배수이면서 5의 배수라면 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요. : ");
//		int num = sc.nextInt();
//		if (num % 3 == 0) {
//			System.out.printf("%d 는 3의 배수입니다.\n", num);
//			if (num % 5 == 0 && num % 3 == 0) {
//				System.out.printf("%d 는 3과 5의 배수입니다.\n", num);
//			}
//		} else {
//			System.out.println("아니에여");
//		}
//
//		sc.close();

		// 문제
		// 두개의 정수를 입력 받아 큰 수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 두개를 입력하세요. : ");
//		int num1 = sc.nextInt(),num2 = sc.nextInt();
//		if (num1 > num2) {
//			System.out.printf("%d가 더 큰수 입니다.",num1);
//		}
//		else {
//			System.out.printf("%d가 더 큰수 입니다.",num2);
//		}
//		sc.close();

		// 문제
		// 세 개의 정수를 입력받아 큰 수 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 1번을 입력하세요. : ");
//		int num1 = sc.nextInt();
//		System.out.println("숫자 2번을 입력하세요. : ");
//		int num2 = sc.nextInt();
//		System.out.println("숫자 3번을 입력하세요. : ");
//		int num3 = sc.nextInt();
//
//		if (num1 > num2 && num1 > num3) {
//			System.out.printf("%d가 가장 큰 수입니다.", num1);
//		}
//		if (num2 > num1 && num2 > num3) {
//			System.out.printf("%d가 가장 큰 수입니다.", num2);
//		}
//		if (num3 > num1 && num3 > num2) {
//			System.out.printf("%d가 가장 큰 수입니다.", num3);
//		}
//		sc.close();

		// 문제 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 1번을 입력하세요. : ");
//		int num1 = sc.nextInt();
//		System.out.println("숫자 2번을 입력하세요. : ");
//		int num2 = sc.nextInt();
//		System.out.println("숫자 3번을 입력하세요. : ");
//		int num3 = sc.nextInt();
//		
//		int sum = num1+num2+num3;
//		int avg = (sum/3);
//		System.out.printf("총합 : %d 평균 : %d",sum,avg);
		
		// 문제
		// 입력한 수가 짝수이고, 3의 배수라면 출력
		// 입력한 수가 홀수이고, 5의 배수라면 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

		//01
//		if(n%2==0 && n%3==0)
//			System.out.printf("%d 는 짝수이면서 3의배수입니다\n",n);
//			
//		if(n%2==1 && n%5==0)
//			System.out.printf("%d 는 홀수이면서 5의배수입니다\n",n);
		
//		if(n%2==0) {
//			
//			if(n%3==0)
//				System.out.printf("%d 는 짝수이면서 3의배수입니다\n",n);
//			
//		}else {
//			
//			if(n%5==0)
//				System.out.printf("%d 는 홀수이면서 5의배수입니다\n",n);
//		}
//		
//		sc.close();
		
		// -----------------------
		// IF - ELSE IF - ELSE
		// -----------------------
		// 과목 1,2,3,4 중 하나라도 40점 미만이면 불합격
		// 과목 평균이 100점 만점 기준으로 60점 미만이면 불합격
		// 아니면 합격
		
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1 + 과목2 + 과목3 + 과목4)/4;
//		
//		if(과목1<40) 
//		{
//			System.out.println("불합격");
//		}
//		else if(과목2<40) 	// 과목1>=40 && 과목2<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목3<40) 	// 과목1>=40 && 과목2<40 && 과목3<40
//		{
//			System.out.println("불합격");
//		}
//		else if(과목4<40) 	// 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4<40
//		{
//			System.out.println("불합격");
//		}
//		else if(평균<60) 	// 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균<60
//		{
//			System.out.println("불합격");
//		}
//		else	// 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균>=60
//		{
//			System.out.println("합격");
//		}

		// 문제
		// 시험 점수를 입력받아
		// 90 ~ 100점은 A,
		// 80 ~ 89점은 B,
		// 70 ~ 79점은 C,
		// 60 ~ 69점은 D,
		// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		int 점수 = sc.nextInt();
//		
//		if(점수 <=100 && 점수 >=90) {
//			System.out.println("A 등급 입니다.");
//		}
//		else if(점수 <=89 && 점수 >=80) {
//			System.out.println("B 등급 입니다.");
//		}
//		else if(점수 <=79 && 점수 >=70) {
//			System.out.println("C 등급 입니다.");
//		}
//		else if(점수 <=69 && 점수 >=60) {
//			System.out.println("D 등급 입니다.");
//		}
//		else{
//			System.out.println("F 등급 입니다.");
//		}
		
		
		// 문제
		// 나이별로 요금을 부과하는 else if 문을 만드세요.
		// 8세 미만 : 요금은 1000원
		// 14세 미만 : 요금은 2000원
		// 20세 미만 : 요금은 2500원
		// 20세 이상 : 요금은 3000원
		
//		Scanner sc = new Scanner(System.in);
//		int 나이 = sc.nextInt();
//		
//		if(나이<8) {
//			System.out.printf("%d세 요금은 1000원 입니다.",나이);
//		}
//		else if(나이<14) {
//			System.out.printf("%d세 요금은 2000원 입니다.",나이);
//		}
//		else if(나이<20) {
//			System.out.printf("%d세 요금은 2500원 입니다.",나이);
//		}
//		else if(나이>=20) {
//			System.out.printf("%d세 요금은 3000원 입니다.",나이);
//		}

		
		

	}
}
