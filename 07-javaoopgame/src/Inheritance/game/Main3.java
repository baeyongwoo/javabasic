package Inheritance.game;

public class Main3 {
	public static void main(String[] args) {
		Magicion magic = new Magicion();
		magic.setId("magic1");
		magic.hp = 150;
		magic.steminer = 300;
		magic.level = 8;
		magic.AP = 300;
		magic.getInfo();
		
		System.out.println("------------------------------------------------");
		Archer archer1 = new Archer();
		archer1.setId("archer1");
		archer1.level = 10;
		archer1.hp = 180;
		archer1.steminer = 130;
		archer1.Street = 150;
		archer1.getInfo();
		
		
	}
}
