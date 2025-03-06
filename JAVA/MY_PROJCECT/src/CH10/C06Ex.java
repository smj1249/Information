package CH10;

import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {
		// 5개의 정수값을 입력받아 int형 배열에 저장하고
		// 최대값, 최소값, 전체합을 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		
//		int [] arr = new int[5];
//		System.out.println("5개의 값을 입력하세요");
//		arr[0] = sc.nextInt();
//		arr[1] = sc.nextInt();
//		arr[2] = sc.nextInt();
//		arr[3] = sc.nextInt();
//		arr[4] = sc.nextInt();
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int el : arr) {
//			if(max<el)
//				max=el;
//			if(min>el)
//				min=el;
//		}
//		
//		System.out.printf("최대값 : %d ", max);
//		System.out.printf("최소값 : %d ", min);
//		System.out.printf("총합 : %d ", arr[0] + arr[1] + arr[2] + arr[3] + arr[4]);

		// 5명의 학생에 국영수점수를 입력받아 2차원배열 저장
		// 각 학생의 국영수 점수의 합/평균 구하고
		// 각 과목당 합 / 평균 구해보세요
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[5][3];

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d 번째 학생 국영수 입력 : ", i + 1);
			score[i][0] = sc.nextInt(); // i번째 학생의 국어 점수 입력
			score[i][1] = sc.nextInt(); // i번째 학생의 영어 점수 입력
			score[i][2] = sc.nextInt(); // i번째 학생의 수학 점수 입력
		}
		// 학생별 점수 총점 / 평균
		for (int i = 0; i < score.length; i++) {
			int sum = score[i][0] + score[i][1]+score[i][2];
			double avg = (double)sum/3;
			System.out.printf("%d 번째 학생 총점 : %d 평균 : %f\n",i+1,sum,avg);
		}
		
		// 과목별 점수 총점 / 평균
		int subject_sum[] = new int[3];
		for (int i = 0; i < score.length; i++)	// 국어 , 영어 , 수학
		{ 
			for(int j=0;j<score[i].length;j++) {
				subject_sum[i] += score[j][i];
			}
		}
		System.out.printf("국어 총점 : %d 국어 평균 : %f\n",subject_sum[0],(double)subject_sum[0]/score.length);
		System.out.printf("국어 총점 : %d 영어 평균 : %f\n",subject_sum[0],(double)subject_sum[1]/score.length);
		System.out.printf("국어 총점 : %d 수학 평균 : %f\n",subject_sum[0],(double)subject_sum[2]/score.length);
	}
}