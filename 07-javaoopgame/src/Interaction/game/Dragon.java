package Interaction.game;

public class Dragon extends Monster{

	public Dragon() {
		super(15,3 , 1, "드래곤", 30);
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
