package Interaction.game;

import java.io.ObjectInputStream.GetField;

public class User{
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int lv;
	private int exp;
	private String name;
	private String skname;
	private int satk;
	private int mpc;//소비량

	//hp, mp, atk, def, 직업이름, 스킬이름, 스킬공격력
	public User(int hp, int mp, int atk, int def
			, String name, String skname, int satk, int mpc) {

		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
		this.def = def;
		this.lv = 1;
		this.exp = 0;
		this.name = name;
		this.skname = skname;
		this.satk = satk;
		this.mpc = mpc;
	}

	public void showStatus() {
		System.out.println("직업 : " + getName());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 : " + getMp());
		System.out.println("공격력 : " + getAtk());
		System.out.println("방어력 : " + getDef());
		System.out.println("레벨 : " + getLv());
		LevelUp(getLv());
		System.out.println("경험치 : " + getExp());
		System.out.println("보유하고 있는 스킬 : " + getSkill_name());
		System.out.println("==========================");
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
	public String getSkill_name() {
		return skname;
	}
	public void setSkill_name(String skill_name) {
		this.skname = skill_name;
	}
	public int getSkill_atk() {
		return satk;
	}
	public void setSkill_atk(int skill_atk) {
		this.satk = skill_atk;
	}
	public int getMpc() {
		return mpc;
	}

	public void setMpc(int mpc) {
		this.mpc = mpc;
	}

	public void hunt(Monster m) {
		if(m.getHp() <= 0) {
			System.out.println("이미 죽은 " +m.getName()  +" 를 공격할 수 없습니다.");
			return;
		}
		m.doBattle(this.atk);
		if(m.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(m.getHp() <= 0) {
			setExp(m.getExp() + getExp());
			System.out.println("경험치를 " + m.getExp() + " 획득했습니다.");

		}
		this.hp = (this.hp - this.def) - m.getAtk();
		System.out.println(m.getName() + "와의 교전 완료!");
		
		m.doBattle(this.satk, this.skname);
		if(m.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
	}
	/*
	 * 1 - > 2 30
	 * 2 - > 3 60
	 * 3 - > 4 90
	 * 4 - > 5 120
	 */
	public int LevelUp(int lv) {
		
		switch (getLv()) {
		case 1:
			if(getExp() >=30) {
				setLv(getLv() + 1);
				System.out.println("!!!!!!!!!!!레벨업 하였습니다.!!!!!!!!!!!!");
				System.out.println("현재 레벨 : " + getLv());
				setExp(getExp() - 30); 
			}
			break;
		case 2:
			if(getExp() >=60) {
				setLv(getLv() + 1);
				System.out.println("!!!!!!!!!!레벨업 하였습니다.!!!!!!!!!!!");
				System.out.println("현재 레벨 : " + getLv());
				setExp(getExp() - 60); 
			}
		case 3:
			if(getExp() >=90) {
				setLv(getLv() + 1);
				System.out.println("!!!!!!!!!!!레벨업 하였습니다.!!!!!!!!!!!!!!!");
				System.out.println("현재 레벨 : " + getLv());
				setExp(getExp() - 90); 
			}
		case 4:
			if(getExp() >=120) {
				setLv(getLv() + 1);
				System.out.println("!!!!!!!!!!!!!레벨업 하였습니다.!!!!!!!!!!!!!!");
				System.out.println("현재 레벨 : " + getLv());
				setExp(getExp() - 120); 
			}
			break;
		default:
			System.out.println("경험치가 부족합니다.");
			break;
		}
		return getLv();
	}//level업 메소드
	
	public void skillAtack(Monster m) {
		
		System.out.println("스킬 시전을 시작합니다. " + getSkill_name() + "");
		if(getMp() <= 0) {
			System.out.println("마나가 부족해서 스킬을 사용할 수 없습니다.");
			return ;
		}else {
			setMp(getMp() - mpc);
			System.out.println(getMpc() + "마나를 소비해 스킬을 사용합니다. "
					+ "	현재 마나 : "  +  getMp());
			System.out.println("======================");
		}
		
		if(m.getHp() <= 0) {
			System.out.println("이미 죽은 " +m.getName()  +" 를 공격할 수 없습니다.");
			return;
		}
		m.doBattle(this.satk);
		if(m.getAtk() > (this.hp + this.def)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(m.getHp() <= 0) {
			setExp(m.getExp() + getExp());
			System.out.println("경험치를 " + m.getExp() + " 획득했습니다.");

		}
		this.hp = (this.hp - this.def) - m.getAtk();
		System.out.println(m.getName() + "와의 교전 완료!");
		
		
		
	}
	
	
}
