package buyandsell;

public class kiwiSeller{
	
	private int money;
	private int kiwi;
	
	public kiwiSeller(int kiwi) {
		this.money = 0;
		this.kiwi = kiwi;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getKiwi() {
		return kiwi;
	}
	public void setKiwi(int kiwi) {
		this.kiwi = kiwi;
	}
	
	public void SellKiwi(int kiwi) {
		if(getKiwi() - kiwi < 0) {
			setKiwi(0);
			System.out.println("키위는 품절입니다.");
			return;
		}
		
		System.out.println("키위 팔린 갯수 : " + getKiwi());
		setMoney(kiwi * 3000);
		setKiwi(getKiwi() - kiwi);
		
	}
	
	public void showSellor() {
		System.out.println("===========판매자=============");
		System.out.println("현재 남은 키위 : " + getKiwi());
		System.out.println("오늘 수익  : " + getMoney());
		
	}
}
