package accessmodifier.game;

public class Wizard extends Commoner{

	public Wizard(String id) {
		super(id);
		setHp(80);
		setMp(300);
	}

	public void WizardInfo() {
		System.out.println("====법사의 기본 스펙=====");
		setHp(150);
		setMp(300);
		System.out.println("기본 체력은 : " + getHp());
		System.out.println("기본 마나는 : " + getMp());
		
	}
	
	
	@Override
	public void getAllData() {

		System.out.println(getId() + "유저는 현재  레벨은 : " + getLevel());
		System.out.println(getId()  + "유저는 현재  경험치는 : " + getExp());
		System.out.println(getId() + "유저는 현재  hp는  : " + getHp());
		System.out.println(getId() + "유저는 현재  mp는 : " + getMp());
	}
	
	@Override
	public void hunt() {
		if(getHp() + 10 <= 0) {
		setHp(getHp() - 10);
		setExp(getExp() + 30);
		System.out.println(getId() + "는 몬스터를 기본 공격으로 잡아서. 체력은 " 
					+ 10  + "감소 하였고, 경험치는 "
					+ getExp() +" 증가 하였습니다.");
		}else {
			System.out.println("체력이 없습니다 물약을 사용해주세요 ");
			setHp(0);
		}
	}
	
	public void icestrake() {
		//위자드 스킬 사용하면 마나 70 감소
		if(getMp() + 70 <= 0) {
		setMp(getMp() - 70);
		setExp(getExp() + 50);
		System.out.println(getId() + "는 몬스터를 아이스 스트라이크로 잡아서.  " 
					+ "경험치는 "+ 50   + "증가하였고" 
					+  " 마나는 "  + 70 + "감소 되었습니다.");
		}else {
			System.out.println("스킬을 사용할 마나가 없습니다. 물약을 사용해주세요 ");
			setMp(0);
		}
	}
	
}
