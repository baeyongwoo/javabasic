package accessmodifier;

public class Warrior {
	//hp, atk, level exp 속성 추가
	//사용자가 main에서 임의로 수치를 고치는 것을 막기위해
	//public 대신 private로 수정
	//private 같은 지역
	private int hp;
	private int atk;
	private int level;
	private int exp;
	private String id;
	//메서드는  아무리 사용해도 개발자의 의도대로만 사용되도록
	//제한하기 수월하기 때문에 일반적으로 public 설정
	
	
	
	public Warrior(String id) {
		//체력 공격력은 생성시 20, 3으로
		this.hp = 20;
		this.atk = 3;
		//레벨, 경험치는 생성시 1, 0으로
		this.level = 1;
		this.exp = 0;
		//id는 사용자 입력대로
		this.id = id;
		System.out.println(getId() + "님이 로그인 하셧습니다.");
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력은 " + hp + "가 되었고");
		System.out.println("누적 경험치는 " + exp + "가 되었습니다.");
	}
	
	
}
