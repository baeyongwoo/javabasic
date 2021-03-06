package buyandsell;

public class Buyer {
	//구매자
	//구매자는 돈, 망고 갯수를 멤버변수로
	//은닉으로 private
	private int money;
	private int mango_number;
	private int kiwi_number;

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMango_number() {
		return mango_number;
	}
	public void setMango_number(int mango_number) {
		this.mango_number = mango_number;
	}

	public int getKiwi_number() {
		return kiwi_number;
	}
	public void setKiwi_number(int kiwi_number) {
		this.kiwi_number = kiwi_number;
	}

	//생성자는 (int money)를 받아 돈을 초기화
	//망고는 자동으로 0을 대입
	public Buyer(int money) {
		this.money = money;
		this.mango_number = 0;
		this.kiwi_number = 0;
	}

	//Buymango는 망고를 삽니다
	//(int mango)망고 갯수를 입력받으면, 망고 * 1000만큼의 
	//돈을 차감하고 망고 변수에 그만큼 갯수를 늘려줍니다.


	//buyer의 buyMango메서드의 파라미터에 Seller를 줘서 buyer내부에서 seller까지 같이 컨트롤
	public void buyMango(int mango, mangoSeller seller) {

		if(mango * 1000 > getMoney()) {
			System.out.println("돈이 없어서 구매 불가");
			return;
		}
		if(mango <= seller.getMango()) {
			System.out.println("==================");
			System.out.println("상인한테 망고 구매할 갯수");
			System.out.println(mango);
			System.out.println("==================");
			setMango_number(mango);
			setMoney(getMoney() - (mango * 1000));
			seller.setMango(seller.getMango() - mango);
			seller.setMoney(seller.getMoney() + (mango *1000)); 
		} 
	}

	//		seller.SellMango(100.);

	//ShowBuyer는 구매자의 상태를 보여준다.

	public void buyKiwi(int kiwi, kiwiSeller ks) {
		if(kiwi * 1000 > getMoney()) {
			System.out.println("돈이 없어서 구매 불가");
			return;
		}
		if(kiwi <= ks.getKiwi()) {
			System.out.println("==================");
			System.out.println("상인한테 키위 구매할 갯수");
			System.out.println(kiwi);
			System.out.println("==================");
			setKiwi_number(kiwi);;
			setMoney(getMoney() - (kiwi * 1000));
			ks.setKiwi(ks.getKiwi() - kiwi);
			ks.setMoney(ks.getMoney() + (kiwi *1000)); 
		}else {
			System.out.println("##################구매실패##################");
			System.out.println("키위 재고가 부족합니다. 현재 가지고 있는 키위는 " + ks.getKiwi() + "개 입니다.");
		}
	}


	public void showBuyer() {
		System.out.println("=============구매자===========");
		System.out.println("현재 망고갯수 : " + getMango_number());
		System.out.println("현재 키위갯수 : " + getKiwi_number());
		System.out.println("현재 돈 : " + getMoney() + "원");
	}

}
