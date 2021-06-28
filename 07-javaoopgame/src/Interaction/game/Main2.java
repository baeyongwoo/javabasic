package Interaction.game;

public class Main2 {

	public static void main(String[] args) {
		Monster d1 = new Dragon();
		Monster t1 = new Troll();
		Monster o1 = new Orc();
		Monster k1 = new Krilla();
		User w1 = new Warrior();
		User w2 = new Archer();
		
		w1.showStatus();
		System.out.println("===============");
		w1.hunt(d1);
		w1.hunt(d1);
		w1.showStatus();
		System.out.println("===============");
		w1.hunt(t1);
		w1.showStatus();
		System.out.println("===============");
		w1.hunt(o1);
		w1.hunt(o1);
		w1.showStatus();
		System.out.println("================");
		w2.showStatus();
		w2.hunt(k1);
		w2.hunt(k1);
		w2.hunt(k1);
		w2.hunt(k1);
		w2.hunt(k1);
		w2.hunt(k1);
		w2.hunt(k1);
		w2.showStatus();
		System.out.println("================");
		Monster d2 = new Dragon();
		Monster t2 = new Troll();
		Monster o2 = new Orc();
		Monster k2 = new Krilla();
		w2.hunt(t2);
		w2.hunt(t2);
		w2.hunt(d2);
		w2.hunt(d2);
		w2.hunt(o2);
		w2.hunt(o2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.hunt(k2);
		w2.showStatus();
		Monster d3 = new Dragon();
		w2.hunt(d3);
		w2.hunt(d3);
		w2.showStatus();
		
		w2.skillAtack(d3);

	}

}
