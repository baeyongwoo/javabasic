package accessmodifier.game;

public class Archer extends Commoner{

	public  Archer(String id) {
		super(id);
	}

	public void ArcherInfo() {
		System.out.println("====궁수의 기본 스펙=====");
		setHp(250);
		setMp(150);
		System.out.println("기본 체력은 : " + getHp());
		System.out.println("기본 마나는 : " + getMp());
		
	
	}
	@Override
	public void getAllData() {
		super.getAllData();

	}
	
	@Override
	public void hunt() {
		//기본 공격은 체력 10깎이고 경험치 30증가
		if(getHp() - 10 <= 0) {
			setHp(0);
			System.out.println("기본 공격할 체력이 없습니다. 물약을 사용해주십시오");
		}else if(getHp() - 10 >= 0){
		setHp(getHp() - 10);
		setExp(getExp() + 30);
		System.out.println(getId() + "는 몬스터를 기본 공격으로 잡아서. 체력은 " 
					+ getHp() + "으로감소 하였고, 경험치는 "
					+ getExp() + "증가 하였습니다.");
		}
	}
	
	public void DoubleShot() {
		//스킬은 마나 10 깎이고 경험치 50 증가
		if(getMp() - 10 >= 0) {
		setMp(getMp() - 10);
		setExp(getExp() + 50);
		System.out.println(getId() + "는 몬스터를 더블샷으로 잡아서."
					+ " 경험치는 "
					+ getExp() + "으로 증가 하였고, 마나는 "
					+ getMp() + "으로 감소 되었습니다.");
		} else {
			System.out.println("스킬 사용할 마나가 없습니다. 물약을 사용해주세요");
		}
	}

}
