public class SwitchCase1 {
	public static void main(String[] args) {
		int a = 3;
		switch (a) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("????");
			break;//마지막은 필요없으나 일관성
		}
		
	}
}
