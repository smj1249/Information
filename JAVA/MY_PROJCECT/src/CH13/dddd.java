package CH13;

public class dddd {
	public class Mul {
		void mul(int a, int b) {
			
		}

		void mul(int a, int b, int c, int d, int e) {

		}

		void mul(double a, double b, double c, double d) {

		}

		void mul(String a, String b, String c, String d) {

		}
 
		public static void main(String[] args) {
			Ch13.Team_interface.일조.Mul cal1 = new Ch13.Team_interface.일조.Mul();
			cal1.mul(10, 20); // 2개 인자 받아 곱셈 화면 출력
			cal1.mul(10, 20, 30, 40, 50);// n개 인자 받아 곱셈 화면 출력
			cal1.mul(10.5, 20.2, 30.4, 50.6);// n개 인자 받아 곱셈 화면 출력
			cal1.mul("문자열1", "문자열2", "문자열3", "문자열4");// n개 문자열받아 '*'를 기준으로 문자열덧붙여 출력
		}

	}

}
