package buyandsell;

public class Main {

	public static void main(String[] args) {
		Buyer by = new Buyer(10000);//현재 가지고 있는 돈 입력
		mangoSeller se = new mangoSeller(100);	//망고갯수
		
		System.out.println("A손님");//정상적인 거래
		se.showSeller();
		by.showBuyer();
		
		by.buyMango(5, se);	//사고자 하는 망고 갯수
		by.showBuyer();
		se.showSeller();
		
		System.out.println();
		
		System.out.println("B손님");	//돈이 없는 경우
		
		Buyer by2 = new Buyer(100);
		se.showSeller();
		by2.showBuyer();
		
		
		by2.buyMango(20, se);
		by2.showBuyer();
		se.showSeller();
		
	}

}
