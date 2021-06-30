package Interaction.game;

public class Krilla extends Monster{

	public Krilla() {
		super(60, 7, 1, "크릴라", 50);
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
