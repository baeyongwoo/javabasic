package accessmodifier.game;

public class Commoner {
	private  int level = 1;
	private int exp = 0;
	private int hp = 100;
	private int mp = 100;
	private String id;
	
	

	public Commoner(String id) {
		super();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
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
	
	public void getAllData() {
		System.out.println(getId()+ "유저는 현재  레벨은 : " + getLevel());
		System.out.println(getId()+ "유저는 현재  경험치는 : " + getExp());
		System.out.println(getId()+ "유저는 현재  hp는  : " + getHp());
		System.out.println(getId()+ "유저는 현재  mp는 : " + getMp());
	}
	
	
	public void hunt() {
		setHp(hp - 10);
		setExp(30);
		System.out.println("몬스터를 기본 공격으로 잡아서. 체력은 " 
					+ getHp() + "경험치는 "
					+ getExp() + "되었습니다.");
	}
	
	
	
}
