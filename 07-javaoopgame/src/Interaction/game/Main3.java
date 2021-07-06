//package Interaction.game;
//
//import java.util.Scanner;
//import Interaction.game.Monster;
//import Interaction.game.User;
//public class Main3 {
//	
//	static Archer a1 = new Archer();
//	static Assassin as1 = new Assassin();
//	static Warrior w1 = new Warrior();
//	static Magician m1 = new Magician();
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		//직업 생성
//		//기본 생성 조회
//		//		a1.showStatus();
//		//		as1.showStatus();
//		//		w1.showStatus();
//		//		m1.showStatus();
//		//		//몬스터 생성
//		//		Troll t1 = new Troll();
//		//		Orc o1 = new Orc();
//		//		Dragon d1 = new Dragon();
//		//		Krilla k1 = new Krilla();
//		//		//스킬 사용
//		//		a1.skillAtack(t1);
//		//		as1.skillAtack(o1);
//		//		w1.skillAtack(d1);
//		//		w1.skillAtack(d1);
//		//		m1.skillAtack(k1);
//		//		m1.skillAtack(k1);
//		//		m1.skillAtack(k1);
//		//		m1.skillAtack(k1);
//		//		m1.skillAtack(k1);
//		//		//사냥 후 조회
//		//		a1.showStatus();
//		//		as1.showStatus();
//		//		w1.showStatus();
//		//		m1.showStatus();
//
//		System.out.println("직업 선택을 해주세요 (전사, 법사, 궁수, 도적)");
//		String choice = scan.next();
//		switch (choice) {
//		case "전사":
//			System.out.println("전사의 기본 정보");
//			//Warrior n1 = new Warrior();
//			w1.showStatus();
//			break;
//		case "법사":
//			System.out.println("법사의 기본 정보");
//			Magician m1 = new Magician();
//			m1.showStatus();
//			break;
//		case "궁수":
//			System.out.println("궁수의 기본 정보");
//			Archer a1 = new Archer();
//			a1.showStatus();
//			break;
//		case "도적":
//			System.out.println("도적의 기본 정보");
//			Assassin as1 = new Assassin();
//		default:
//			System.out.println("적혀 있는 직업만 골라주세요.");
//			break;
//
//		}//직업 선택 switch끝 
//		System.out.println("=======================================");
//		System.out.println("직업 선택을 완료하였습니다.");
//		System.out.println("님의 선택하신 직업은 : " + choice + "입니다");
//		//전투 
//
//		while(true) {
//			System.out.println("====================================");
//			System.out.println("모의 전투를 시작하겟습니다.");
//			System.out.println("몬스터 생성 중");
////			Orc o1 = new Orc();
////			Troll t1 = new Troll();
////			Dragon d1 = new Dragon();
////			Krilla k1 = new Krilla();
//		
//			if(choice.equals("전사")) {
//				while(true) {
//					System.out.println("어떤 몬스터를 잡겠습니까?");
//					System.out.println("(O)rc / (T)roll / (D)ragon / (K)rilla");
//					String ch = scan.next();
//					ch = ch.toUpperCase();
//					switch (ch) {
//						case "O": Orc o1 = new Orc();
//						System.out.println("오크가 선택되었습니다.");
//						System.out.println("기본 공격은 (A)ttack 스킬 사용은 (S)kill 사냥종료는 (Q)uit");
//						String sk1 = scan.next();
//							switch (sk1) {
//								case "A": m1.hunt(o1);
//								break;
//								case "S" : m1.skillAtack(o1);
//								break;
//								case "Q" :	System.out.println("사냥을 종료합니다."); 
//								return ;
//								default:
//									System.out.println("메뉴얼대로 입력해주세요1  ");
//									break;
//							}//Orc 생성후 내부 사냥로직
//					break;
//					case "T": Troll t1 = new Troll();
//						System.out.println("트롤이 선택되었습니다.");
//						System.out.println("기본 공격은 (A)ttack 스킬 사용은 (S)kill 사냥종료는 (Q)uit");
//							String sk11 = scan.next();
//							switch (sk11) {
//							case "A": m1.hunt(t1);
//							break;
//							case "S" : m1.skillAtack(t1);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요2  ");
//								break;
//						}//troll 생성호 내부 사냥로직
//					break;
//					case "D": Dragon d1 = new Dragon();
//						System.out.println("드래곤이 선택되었습니다.");
//						System.out.println("기본 공격은 (A)ttack 스킬 사용은 (S)kill 사냥종료는 (Q)uit");
//						String sk1111 = scan.next();
//							switch (sk111) {
//							case "A": m1.hunt(d1);
//							break;
//							case "S" : m1.skillAtack(d1);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							break; 
//							default:
//								System.out.println("메뉴얼대로 입력해주세요3  ");
//								break;
//				}//드래곤 생성호 내부 사냥로직
//					break;
//					case "K": Krilla k1 = new Krilla();
//						switch (sk11) {
//							case "A": m1.hunt(k1);
//							break;
//							case "S" : m1.skillAtack(k1);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요 4 ");
//							break;
//						}//krilla
//					}//내부 swich
//				}//while
//			}//if
//			if(choice.equals("궁수")) {
//				while(true) {
//					System.out.println("어떤 몬스터를 잡겠습니까?");
//					System.out.println("(O)rc / (T)roll / (D)ragon / (K)rilla");
//					String ch = scan.next();
//					ch = ch.toUpperCase();
//					ch = scan.next();
//					String sk = scan.next();
//					ch = ch.toUpperCase();
//					sk = sk.toUpperCase();
//					switch (ch) {
//						case "O": Orc o2 = new Orc();
//							switch (sk) {
//								case "A": m1.hunt(o2);
//								break;
//								case "S" : m1.skillAtack(o2);
//								break;
//								case "Q" :	System.out.println("사냥을 종료합니다."); 
//								return ;
//								default:
//									System.out.println("메뉴얼대로 입력해주세요  ");
//									break;
//							}//Orc 생성후 내부 사냥로직
//					case "T": Troll t2 = new Troll();
//						switch (sk) {
//							case "A": m1.hunt(t2);
//							break;
//							case "S" : m1.skillAtack(t2);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//						}//troll 생성호 내부 사냥로직
//					break;
//					case "D": Dragon d2 = new Dragon();
//						switch (sk) {
//							case "A": m1.hunt(d2);
//							break;
//							case "S" : m1.skillAtack(d2);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							break; 
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//				}//드래곤 생성호 내부 사냥로직
//					break;
//					case "K": Krilla k2 = new Krilla();
//						switch (sk) {
//							case "A": m1.hunt(k2);
//							break;
//							case "S" : m1.skillAtack(k2);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//							break;
//						}//krilla
//					}//내부 swich
//				}//while
//			}//
//			if(choice.equals("법사")) {
//				while(true) {
//					System.out.println("어떤 몬스터를 잡겠습니까?");
//					System.out.println("(O)rc / (T)roll / (D)ragon / (K)rilla");
//					String ch = scan.next();
//					String sk = scan.next();
//					ch = ch.toUpperCase();
//					sk = sk.toUpperCase();
//					switch (ch) {
//						case "O": Orc o3 = new Orc();
//							switch (sk) {
//								case "A": m1.hunt(o3);
//								break;
//								case "S" : m1.skillAtack(o3);
//								break;
//								case "Q" :	System.out.println("사냥을 종료합니다."); 
//								return ;
//								default:
//									System.out.println("메뉴얼대로 입력해주세요  ");
//									break;
//							}//Orc 생성후 내부 사냥로직
//					case "T": Troll t3 = new Troll();
//						switch (sk) {
//							case "A": m1.hunt(t3);
//							break;
//							case "S" : m1.skillAtack(t3);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//						}//troll 생성호 내부 사냥로직
//					break;
//					case "D": Dragon d3 = new Dragon();
//						switch (ch) {
//							case "A": m1.hunt(d3);
//							break;
//							case "S" : m1.skillAtack(d3);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							break; 
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//				}//드래곤 생성호 내부 사냥로직
//					break;
//					case "K": Krilla k3 = new Krilla();
//						switch (sk) {
//							case "A": m1.hunt(k3);
//							break;
//							case "S" : m1.skillAtack(k3);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//							break;
//						}//krilla
//					}//내부 swich
//				}//while
//			}//if
//			if(choice.equals("도적")) {
//				while(true) {
//					System.out.println("어떤 몬스터를 잡겠습니까?");
//					System.out.println("(O)rc / (T)roll / (D)ragon / (K)rilla");
//					String ch = scan.next();
//					String sk = scan.next();
//					sk = sk.toUpperCase();
//					ch = ch.toUpperCase();
//					switch (ch) {
//						case "O": Orc o4 = new Orc();
//						System.out.println("기본 공격은 (A)ttack 스킬 사용은 (S)kill 사냥종료는 (Q)uit");
//						
//							switch (sk) {
//								case "A": m1.hunt(o4);
//								break;
//								case "S" : m1.skillAtack(o4);
//								break;
//								case "Q" :	System.out.println("사냥을 종료합니다."); 
//								return ;
//								default:
//									System.out.println("메뉴얼대로 입력해주세요  ");
//									break;
//							}//Orc 생성후 내부 사냥로직
//					case "T": Troll t4 = new Troll();
//					System.out.println("기본 공격은 (A)ttack 스킬 사용은 (S)kill 사냥종료는 (Q)uit");
//				
//						switch (sk) {
//							case "A": m1.hunt(t4);
//							break;
//							case "S" : m1.skillAtack(t4);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//						}//troll 생성호 내부 사냥로직
//					
//					case "D": Dragon d4 = new Dragon();
//						switch (sk) {
//							case "A": m1.hunt(d4);
//							break;
//							case "S" : m1.skillAtack(d4);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							break; 
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//								break;
//				}//드래곤 생성호 내부 사냥로직
//					break;
//					case "K": Krilla k4 = new Krilla();
//						switch (sk) {
//							case "A": m1.hunt(k4);
//							break;
//							case "S" : m1.skillAtack(k4);
//							break;
//							case "Q" :	System.out.println("사냥을 종료합니다."); 
//							return ;
//							default:
//								System.out.println("메뉴얼대로 입력해주세요  ");
//							break;
//						}//krilla
//					}//내부 swich
//				}//while
//			}//if
//		}//while 끝
//	}
//
//}
//
//	
