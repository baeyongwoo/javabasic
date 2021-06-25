package Inheritance.game;

public class Main1 {
	public static void main(String[] args) {
		//초보자계정 생성 확인
		Commoner c1 = new Commoner();
		c1.setId("abc1234");
		c1.hp = 100;
		c1.level = 1;
		c1.steminer = 100;
		c1.getInfo();
		
	}
}
