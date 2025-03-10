package Ch26;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드

	abstract protected String getSrcString(); // 추상 메소드

	abstract protected String getDestString(); // 추상 메소드

	protected double ratio; // 비율

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Won1Yen extends Converter {

	public Won2Yen() {
		super();
	}

	public Won2Yen(double ratio) {
		super();
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return Math.round(src / ratio);
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "엔화";
	}

}

public class Won2Yen {

	public Won2Yen(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 1조 : 원 -> 엔화
		Won2Yen toYen = new Won2Yen(981); // 100엔화는 981원
		((Converter) toYen).run();
	}
}
