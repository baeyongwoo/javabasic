package accessmodifier;


public class Main {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("zxc1234");
		for(int i = 0; i < 3; i++) {
			warrior.hunt();
		}
		
		System.out.println();
		System.out.println(warrior.getId() + "님의 현재 정보");
		System.out.println("현재 레벨 : " + warrior.getLevel());
		System.out.println("현재 경험치 : " + warrior.getExp());
		System.out.println("현재 체력 : " + warrior.getHp());
		System.out.println("현재 공격력 : " + warrior.getAtk());
		
		System.out.println("================================================");
		Warrior warrior2 = new Warrior("qwer1234");
		for(int i = 0; i < 3; i++) {
			warrior2.hunt();
		}
		
		System.out.println();
		System.out.println(warrior2.getId() + "님의 현재 정보");
		System.out.println("현재 레벨 : " + warrior2.getLevel());
		System.out.println("현재 경험치 : " + warrior2.getExp());
		System.out.println("현재 체력 : " + warrior2.getHp());
		System.out.println("현재 공격력 : " + warrior2.getAtk());
		
	}
}
