package constructor;

public class Main3 {
	public static void main(String[] args) {
		System.out.println("=====선수 정보 입력============");
		BasketballPlayer b1 = new BasketballPlayer("홍길동",170, 130);
		BasketballPlayer b2 = new BasketballPlayer("마이클",200, 50);
		BasketballPlayer b3 = new BasketballPlayer("조던", 185, 50);
		System.out.println();
		
		System.out.println("=====덩큐슛 조건 : (키 + 점프력) 300이상======");
		System.out.println();
		b1.getInfo();
		b1.dumk();
		b2.getInfo();
		b2.dumk();
		b3.getInfo();
		b3.dumk();
		
		
	}
}
