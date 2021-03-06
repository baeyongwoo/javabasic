package buyandsell;

public class Main2 {

	public static void main(String[] args) {
		mangoSeller s1 = new mangoSeller(100);	//100개 망고 팜
		mangoSeller s2 = new mangoSeller(100);		//50개 망고팜
		
		Buyer b1 = new Buyer(50000);	//50000원 가지고 나옴
		
		s1.showSeller();
		s2.showSeller();
		
		b1.buyMango(10, s1);//s1 상인에게 10개를 삼
		
		b1.showBuyer();	//구매자 정보 확인
		
		s1.showSeller();// 1번 상인 정보 확인
		s2.showSeller(); // 2번 상인 정보 확인
		
		System.out.println("=============구매자 b2 ===================");
		Buyer b2 = new Buyer(300);		//돈을 안가져온 경우
		
		s1.showSeller();
		s2.showSeller();
		
		b2.buyMango(10, s1);//s1 상인에게 10개를 삼
		
		b2.showBuyer();	//구매자 정보 확인
		
		s1.showSeller();// 1번 상인 정보 확인
		s2.showSeller(); // 2번 상인 정보 확인
		
		
		System.out.println("==============키위생성 ================");
		kiwiSeller k1 = new kiwiSeller(50);
		
		k1.showSellor();
		b1.buyKiwi(10, k1);//10개를 키위상인한테 구매
		
		b1.showBuyer();
		
		k1.showSellor();
		
		
		System.out.println("================구매자 b2==============");
		b2.buyKiwi(10, k1);
		b2.showBuyer();
		
		k1.showSellor();
		
		System.out.println("============구매자 b3================");
		Buyer b3 = new Buyer(150000);
		k1.showSellor();
		b3.buyKiwi(45, k1);
		b3.showBuyer();
		k1.showSellor();

	}

}
