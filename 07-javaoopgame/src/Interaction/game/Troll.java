package Interaction.game;

public class Troll extends Monster{
	public Troll() {
		super(6, 1 ,0, "오크", 20);
	}
	
	public void doBattle(int uAtk) {
		this.setExp(getHp() + getDef() - uAtk);
		if(getHp() <= 0) {
			System.out.println(getName() + "은/는 이미 죽었습니다.");
		}
	}

	@Override
	public void doBattle(int sAtk, String sName) {
		this.setExp(getHp() + getDef() - sAtk);
		if(getHp() <= 0) {
			System.out.println(getName() + "은/는 이미 죽었습니다.");
		}
	}

}
