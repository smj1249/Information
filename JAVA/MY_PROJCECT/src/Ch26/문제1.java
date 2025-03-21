package Ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문제1 {

	// Scanner 객체 생성 (입력을 받기 위함)
	private static Scanner sc = new Scanner(System.in);

	// 단어를 저장할 리스트 생성
	private static List<String> wordList = new ArrayList<String>();

	public static void add(String word) {
		wordList.add(word);
	}

	// 리스트를 정렬하는 메서드
	// isAsend true: 오름차순 정렬, false: 내림차순 정렬
	public static void sort(boolean isAsend) {
		if (isAsend) {
			Collections.sort(wordList); // 오름차순 정렬
		} else {
			wordList.sort(Collections.reverseOrder()); // 내림차순 정렬
		}
		System.out.println(); // 줄바꿈 출력
	}

	// 현재 리스트에 저장된 단어들을 출력하는 메서드

	public static void show() {
		for (String word : wordList) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		int n = 0; // 메뉴 선택 번호 변수
		while (true) {
			// 메뉴 출력
			System.out.println("--------M E N U -------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 종료");
			System.out.println("--------M E N U -------------");
			System.out.print("번호 : ");

			n = sc.nextInt(); // 사용자 입력 받기

			switch (n) {
			case 1:
				// 단어 추가
				System.out.print("단어 입력 : ");
				String word = sc.next();
				add(word);
				break;
			case 2:
				// 정렬 실행
				System.out.print("오름차순 여부(1:오름차순,0:내림차순) : ");
				int no = sc.nextInt();
				if (no == 1)
					sort(true);
				else
					sort(false);
				break;
			case 3:
				// 단어 리스트 출력
				show();
				break;
			case 4:
				// 프로그램 종료
				System.out.println("종료합니다");
				System.exit(-1);
				break;
			default:
				// 잘못된 입력 처리
				System.out.println("다시 입력하세요");
			}
		}
	}
}
