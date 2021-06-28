package Interaction.game;

public class Monster {
	/*
	 * 모든 몬스터는 Monster.java라는 부모 클래스 가짐
	 * 이 클래스의 상속을 받아서 몬스터를 만들면
	 * Monster라는 자료형 하나로 모든 몬스터 종류를 처리 가능
	 * 기존의 huntXX(몬스터 자료형)메서드는
	 * hunt(Monster)라고 적는것만으로도 모든 몬스터 유형 처리 가능
	 * 
	 * 플레이어로 하나를 만들고
	 * Monster 자료형과 상호작용해 교전할 수 잇는 코드
	 */
	private int hp;
	private int atk;
	private int def;
	private String name;
	private int exp;
	
	public Monster(int hp, int atk, int def, String name, int exp) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.name = name;
		this.exp = exp;
	}
	
	public void doBattle(int uAtk) {
		this.hp = (this.hp + this.def) - uAtk;
		if(this.hp <= 0) {
			System.out.println(name + "은/는 이미 죽었습니다.");
		}
	}
	
	public void doBattle(int sAtk, String sName) {
		this.hp = (this.hp + this.def) - sAtk;
		if(this.hp <= 0) {
			System.out.println(name + "은/는 이미 죽었습니다.");
		}
	}
	
	
	public int getAtk() {
		return this.atk;
	}
	public int getHp() {
		return this.hp;
	}
	public String getName() {
		return this.name;
	}
	
	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	
	
}
