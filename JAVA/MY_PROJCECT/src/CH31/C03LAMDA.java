package CH31;

interface Calculator {
	int calculate(int num1, int num2);
}

public class C03LAMDA {
	public static void main(String[] args) {
		// 덧셈 - Calculator add
		Calculator add =(num1,num2) -> num1+num2;
		// 뺄셈 - Calculator sub
		Calculator sub =(num1,num2) -> num1-num2;
		// 곱셈 - Calculator mul
		Calculator mul =(num1,num2) -> num1*num2;
		// 나눗셈 - Calculator div
		Calculator div =(num1,num2) -> num1/num2;
		
		// 결과
		System.out.println(add.calculate(10,20));		// 덧셈
		System.out.println(sub.calculate(30,10));		// 뺄셈
		System.out.println(mul.calculate(10,20));		// 곱셈
		System.out.println(div.calculate(100,5));		// 나눗셈
	}
	
}
