package CH06;

import java.util.Scanner;

public class C02SWITCH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		char medalcolor;
		switch (ranking) {
		case 1:
			medalcolor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:
			medalcolor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalcolor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalcolor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은" + medalcolor + "입니다.");
	}
}
