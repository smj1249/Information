package Ch33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface	//함수형인터페이스 선언(Compiler에게 전달)
interface Func1 {
	void say(String message);	//추상메서드
}
@FunctionalInterface	
interface Func2 {
	int sum(Integer ...args);	//추상메서드
}
@FunctionalInterface	
interface Func3 {
	List<Integer> createListDesc(int ...args);	//추상메서드
}


public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {
		//01
		Func1 func1 = (message)->{System.out.println(message+"_!");};
		func1.say("HELLO WORLD");
		
		Func1 func1_1 = System.out::println;
		func1_1.say("HELLO WORLD");
		
		//02
		Func2 func2 = (items)->{
			//{} 에 모든 items를 더한값을 리턴(반복문으로 items의 item을 누적해서 리턴)
			int sum=0;
			for(Integer el : items)
				sum+=el;
			return sum;
		};	
		System.out.println(func2.sum(10,20,30,40,556,6,7,8,9));
		
		Func2 func2_2 = (items)->{
			//{} 에 모든 items를 더한값을 리턴(reduce)
			return Arrays.stream(items).reduce(0,(sum,el)->sum+el);
			 
		};	
		System.out.println(func2_2.sum(10,20,30,40,556,6,7,8,9));
		
		
		//원시타입 int[] 받기 -> int를Integer로 boxing -> 내림차순(sorted)  -> List<Integer변환)
		Func3 func3 = (items)->{
			return Arrays	.stream(items)
							.boxed()
							.sorted((a,b)->{return b-a;})
							.collect(Collectors.toList());
		};

		List<Integer> li = func3.createListDesc(10,100,24,1612,42,123,15,4,1);
		System.out.println(li);
		
	}

}
