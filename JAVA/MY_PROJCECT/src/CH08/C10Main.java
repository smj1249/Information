//package CH08;
//
//// 홍길동이			- 			사과장수에게 사과를 구매한다
//// 구매자				-			판매자
//// 보유금액(속성)					보유금액(속성)
//// 사과개수(속성)					사과개수(속성)
////								개당가격(속성)
//// 구매하기(기능)					판매하기(기능)
//// 1) 특정사과장수에게 돈을 건넨다 ->
//// (내보유금액에서는 차감)			2) 돈을 내보유금액에 누적
////								3) 사과개수 계산 -> 나의 보유사과개수에서 차감 -> 사과개수 전달
//// 4) 나의보유사과개수에 누적
//
//class Buyer {
//	private int myMoney;
//	private int appleCnt;
//
//	// 모든 인자 생성자
//	public Buyer(int myMoney, int appleCnt) {
//		super();
//		this.myMoney = myMoney;
//		this.appleCnt = appleCnt;
//	}
//	
//	// toString
//	@Override
//	public String toString() {
//		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
//	}
//	
//	public void payment(Seller seller, int money) {
//		// 내보유금액에서 차감
//		this.myMoney -= money;
//		// seller에 money를 전달하고 리턴되는 사과 개수를 누적
//		int applecnt = seller.receive(money);
//		this.appleCnt += applecnt;
//	}
//}
//
//class Seller {
//	private int myMoney;
//	private int appleCnt;
//	private int price;
//	
//	// 모든 인자 생성자
//	public Seller(int myMoney, int appleCnt, int price) {
//		super();
//		this.myMoney = myMoney;
//		this.appleCnt = appleCnt;
//		this.price = price;
//	}
//
//	// toString
//	@Override
//	public String toString() {
//		return "seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
//	}
//	
//	public int receive(int money) {
//		// 구매자로부터 전달 받은 money를 내 보유금액에 누적
//		this.myMoney += money;
//		int cnt = money / this.price;
//		this.appleCnt-=cnt;
//		// 전달 받은 금액 / 사과개수를 리턴
//		return cnt;
//	}
//	
//}
//
//public class c10Main {
//
//	public static void main(String[] args) {
//		
//		Buyer 홍길동 = new Buyer(10000, 0);
//		Buyer 철수 = new Buyer(20000, 0);
//
//		Seller 사과장수 = new Seller(100000,100,1000);
//		
//		홍길동.payment(사과장수, 5000);
//		철수.payment(사과장수, 12000);
//		
//		System.out.println(홍길동);
//		System.out.println(철수);
//		System.out.println(사과장수);
//
//	}
//
//}
package CH08;


