package CH08;

// 구매자 클래스
class Buyer {
    private int myMoney;  	// 구매자의 보유 금액
    private int appleCnt; 	// 구매자가 보유한 사과 개수
    private String name;	// 구매자들의 이름

    // 모든 인자를 받는 생성자
    public Buyer(String name, int myMoney, int appleCnt) {
    	this.name = name;			// 매개변수로 받은 구매자들 이름 값을 클래스 필드에 할당
        this.myMoney = myMoney;		// 매개변수로 받은 myMoney 값을 클래스 필드에 할당
        this.appleCnt = appleCnt;	// 매개변수로 받은 appleCnt 값을 클래스 필드에 할당
    }
   
    // 객체의 상태를 문자열로 반환하는 toString 메서드
    @Override
    public String toString() {
        return name + " [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
    }
    
    // 구매자가 판매자에게 돈을 지급하고 사과를 구매하는 메서드
    public void payment(Seller seller, int money) {
        this.myMoney -= money; // 지급한 금액만큼 내 보유 금액에서 차감
        int applecnt = seller.receive(money); // 판매자에게 돈을 전달하고, 구매한 사과 개수를 반환받음
        this.appleCnt += applecnt; // 반환받은 사과 개수를 내 보유 개수에 추가
    }
}

// 판매자 클래스
class Seller {
    private String name;	// 구매자들의 이름
    private int myMoney;  // 판매자의 보유 금액
    private int appleCnt; // 판매자가 보유한 사과 개수
    private int price;    // 사과 1개의 가격


    
    // 모든 인자를 받는 생성자
    public Seller(String name, int myMoney, int appleCnt, int price) {
    	this.name = name;
        this.myMoney = myMoney;
        this.appleCnt = appleCnt;
        this.price = price;
    }

    // 객체의 상태를 문자열로 반환하는 toString 메서드
    @Override
    public String toString() {
        return name + "[myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
    }
    
    // 구매자로부터 돈을 받고 사과를 제공하는 메서드
    public int receive(int money) {
        this.myMoney += money; // 받은 돈을 내 보유 금액에 추가
        int cnt = money / this.price; // 받은 돈으로 구매할 수 있는 사과 개수 계산
        this.appleCnt -= cnt; // 판매한 사과 개수만큼 내 보유 개수에서 차감
        return cnt; // 구매자에게 사과 개수 반환
    }
}

// 메인 클래스
public class C11사과구매 {
    public static void main(String[] args) {
        // 구매자 객체 생성
        Buyer 수빈 = new Buyer("수빈",10000, 0); 	// 초기 보유금 10000원, 사과 0개
        Buyer 재웅 = new Buyer("재웅",20000, 0 ); 	// 초기 보유금 20000원, 사과 0개

        // 판매자 객체 생성
        Seller 사과장수 = new Seller("사과장수",100000, 100, 1000); // 초기 보유금 100000원, 사과 100개, 사과 1개당 1000원
        
        // 구매자들이 사과를 구매함
        수빈.payment(사과장수, 5000); // 수빈이가 5000원을 내고 사과 구매
        재웅.payment(사과장수, 12000); // 재웅이가 12000원을 내고 사과 구매
        
        // 최종 상태 출력
        System.out.println(수빈);
        System.out.println(재웅);
        System.out.println(사과장수);
    }
}
