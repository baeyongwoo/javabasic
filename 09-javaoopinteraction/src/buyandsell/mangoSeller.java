package buyandsell;

public class mangoSeller {
	//판매자
	//돈, 망고
	private int money;
	private int mango;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMango() {
		return mango;
	}
	public void setMango(int mango) {
		this.mango = mango;
	}
	
	
	//생성자에서 망고갯수를 입력받을수 있다.
	//돈은 0으로 넣어주기
	
	public mangoSeller(int mango) {
		this.mango = mango;
		this.money = 0;
	}
	
	//판매시 망고갯수를 입력
	//망고갯수 * 1000만큼 돈이 올라가고
	//망고는 판 갯수만큼 차감
	//0 미만으로 망고가 줄어들 수 없다
	public void SellMango(int mango) {
		if(getMango() - mango < 0) {
			setMango(0);
			System.out.println("망고는 품절입니다.");
			return;
		}
		
		System.out.println("망고 팔린 갯수 : " + getMango() );
		setMoney(mango * 1000);
		setMango(getMango() - mango);
		
	}
	
	//showSeller를 이용해 현재 남은 망고와 돈을 볼 수 잇다.
	public void showSeller() {
		System.out.println("===========판매자=============");
		System.out.println("현재 남은 망고 : " + getMango());
		System.out.println("오늘 수익  : " + getMoney());
	}
}
