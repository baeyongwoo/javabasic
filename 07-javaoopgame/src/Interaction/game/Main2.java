package Interaction.game;

public class Main2 {

	public static void main(String[] args) {
		Monster m1 = new Dragon();
		User w1 = new Warrior();
		w1.showStatus();
		
		System.out.println("==================");
		Monster m4 = new Troll();
		User a1 = new Archer();
		a1.huntOrc(m4);
		a1.huntOrc(m4);
		a1.huntOrc(m4);
		a1.showStatus();
		
		System.out.println("===================");
		a1.showStatus();
		w1.showStatus();

	}

}
