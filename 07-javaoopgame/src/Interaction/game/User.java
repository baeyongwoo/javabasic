package Interaction.game;

public class User {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private String name;
	
	public User(int hp, int mp, int atk, int def, String name) {
		
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
		this.lv = 1;
		this.exp = 0;
		this.name = name;
	}
	
	public void showStatus() {
		System.out.println("직업 : " + getName());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 : " + getMp());
		System.out.println("공격력 : " + getAtk());
		System.out.println("방어력 : " + getDef());
		System.out.println("레벨 : " + getLv());
		System.out.println("경험치 : " + getExp());
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	// 특정 몬스터인 오크를 공격하는 공격 메서드
		public void huntOrc(Monster orc) {
			// 공격 전에 먼저 오크의 체력을 체크해서 죽은 오크라면
			// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
			if(orc.getHp() <= 0) {
				System.out.println("이미 죽은 오크를 공격할 수 없습니다.");
				return;
			}
			// 오크와 전투를 할 때는 자신의 공격력을 넘깁니다.
			orc.doBattle(this.atk);
			// 오크쪽 처리가 되고 나서 유저가 공격을 받았을 때
			// 유저가 죽는 상황이라면 역시 전투 메서드 종료
			if(orc.getAtk() > (this.hp + this.def)) {
				System.out.println("유저가 사망했습니다.");
				return;
			}
			// 만약 전투 도중 오크가 죽었다면 경험치 20을 획득
			if(orc.getHp() <= 0) {
				System.out.println("경험치를 20 획득했습니다.");
				this.exp += 20;
			}
			// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
			this.hp = (this.hp + this.def) - orc.getAtk();
			System.out.println("오크와의 교전 완료!");
			
		}

	
	
}