package accessmodifier.game;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main1 {
	static Night n = new Night("null");
	static Wizard w = new Wizard("null");
	static Archer a = new Archer("null");

	public static void main(String[] args) {
		//사용자 입력 (직업 선택)
		Scanner scan = new Scanner(System.in);
		//		 Night n = new Night(null);
		//		 Wizard w = new Wizard(null);
		while(true) {
			System.out.println("아이디를 입력해주세요 ");
			String id = scan.next();
			n.setId(id);
			w.setId(id);
			System.out.println("직업 선택을 해주세요 (전사, 법사, 궁수)");
			String choice = scan.next();
			switch (choice) {
			case "전사":
				System.out.println("전사의 기본 스펙");
				Night n = new Night(id);
				n.NightInfo();
				n.setId(id);
				break;
			case "법사":
				System.out.println("법사의 기본 스펙");
				Wizard w = new Wizard(id);
				w.WizardInfo();
				w.setId(id);
			case "궁수":
				System.out.println("궁수의 기본 스펙");
				Archer a = new Archer(id);
				a.ArcherInfo();
				a.setId(id);
			default:
				System.out.println("적혀 있는 직업만 골라주세요.");
				break;


			}//직업 선택 switch끝 
			System.out.println("=======================================");
			System.out.println("직업 선택을 완료하였습니다.");
			System.out.println(id + "님의 선택하신 직업은 : " + choice + "입니다");
			//전투 

			while(true) {
				System.out.println("====================================");
				System.out.println("모의 전투를 시작하겟습니다.");
				if(choice.equals("전사")) {
					while(true) {
						System.out.println();
						System.out.println("기본공격은 (A)ttack 스킬은 (S)kill 정보 조회는 (I)nfomation "
								+ "전투 중단은 (Q)를 눌러주세요");
						//						Night n = new Night(id);
						String ch = scan.next();
						ch = ch.toUpperCase();
						switch (ch) {
						case "A": n.hunt();
						break;
						case "S" : n.DoubleAttack();
						break;
						case "I" : n.getAllData();
						break;
						case "Q" :	System.out.println("사냥을 종료합니다."); 
						return ;
						default:
							System.out.println("메뉴얼대로 입력해주세요  ");
							break;
						}
					}
				}else if(choice.equals("법사")){
					while(true) {
						System.out.println();
						System.out.println("기본공격은 (A)ttack 스킬은 (S)kill 정보 조회는 (I)nfomation "
								+ "전투 중단은 (Q)를 눌러주세요");
						//						Night n = new Night(id);
						String ch = scan.next();
						ch = ch.toUpperCase();
						switch (ch) {
						case "A": w.hunt();
						break;
						case "S" : w.icestrake();;
						break;
						case "I" : w.getAllData();
						break;
						case "Q" :	System.out.println("사냥을 종료합니다."); 
						return ;
						default:
							System.out.println("메뉴얼대로 입력해주세요  ");
							break;
						}

					}
				}else if(choice.equals("궁수")){
					while(true) {
						System.out.println();
						System.out.println("기본공격은 (A)ttack 스킬은 (S)kill 정보 조회는 (I)nfomation "
								+ "전투 중단은 (Q)를 눌러주세요");
						//					Night n = new Night(id);
						String ch = scan.next();
						ch = ch.toUpperCase();
						switch (ch) {
						case "A": a.hunt();
						break;
						case "S" : a.DoubleShot();
						break;
						case "I" : a.getAllData();
						break;
						case "Q" :	System.out.println("사냥을 종료합니다."); 
						return ;
						default:
							System.out.println("메뉴얼대로 입력해주세요  ");
							break;
						}
					}
				}//while 끝
			}
		}
	}
}




