package Ch31;

//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator {
	int calculate(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {
		//덧셈 - Calculator add 
		Calculator add  = (a,b)->a+b;
		//뺄셈 - Calculator sub
		Calculator sub  = (a,b)->a>b?a-b:b-a;
		//곱셈 - Calculator mul
		Calculator mul  = (a,b)->{return a*b; };
		//나눗셈 - Calculator div
		Calculator div  = (a,b)->{return a>b ? a/b : b/a; };
		
		//결과
		System.out.println(add.calculate(10, 20));//덧셈
		System.out.println(sub.calculate(30, 10));//뺄셈
		System.out.println(mul.calculate(10,20));//곱셈
		System.out.println(div.calculate(100, 5));//나눗셈
	}

}
