package Inheritance.game;

public class Commoner {
	//레벨, 체력, 아이디, 마나수치를 변수로 만들기
	public int level;
	public int hp;
	private String id;	//id는 개인정보로 private로 
	public int steminer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	//메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록
	public void getInfo() {
		System.out.println("아이디  " 
						+ getId() + "님의 정보" + "\n 레벨 :  " 
						+ level + "\t체력  : " 
						+ hp + "\t마나수치 : " 
						+ steminer  + "입니다.");
	}
	
}
