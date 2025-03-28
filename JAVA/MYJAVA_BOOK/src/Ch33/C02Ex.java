package Ch33;

import java.util.Arrays;

@FunctionalInterface
interface Functional{
	Integer execute(int ...args);	
}
class Calc{
	Functional sum;	//합
	Functional sub;	//차
	Functional mul;	//곱
	Functional div;	//나누기
	Calc(){
		//Functional sum 에 대한 스트림 & 람다식 완성 할 것
		sum=(args)->Arrays.stream(args).reduce(0,(sum,el)->sum+el);
		//Functional sub 에 대한 스트림 & 람다식 완성 할 것
		sub=(args)->{
			return Arrays
						.stream(args)
						.boxed()
						.sorted((a,b)->{return b-a;})  
						.reduce(0, (sub,el)->{return sub<el?el-sub:sub-el;});
		};
		//Functional mul 에 대한 스트림 & 람다식 완성 할 것
		mul=(args)->{
			return Arrays.stream(args).reduce(1, (mul,el)->mul*el); 
			
		};
		
		//Functional div 에 대한 스트림 & 람다식 완성 할 것
		div=(args)->{return null; };
		//조건
		//sum,sub,mul,div 각각에 람다&스트림함수를 적절히 이용해서 기능 구현을 합니다
		//모든 인자를 받을 수있는 가변인자 처리로 구현합니다
		//뺄셈,나눗셈은 큰수에서 작은수로 정렬(sorted)한다음 누적 감산 처리(reduce)를 합니다
	}
}
public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 :"+ calc.sum.execute(10,20,30,40,50,60));
		System.out.println("차 :"+ calc.sub.execute(1,4,2,9));//1,2,4,5
		System.out.println("곱 :"+ calc.mul.execute(10,20,30,40,50,60));
		System.out.println("나눗셈 :"+ calc.div.execute(10,20,30,40,50,60));
		
	}	

}
