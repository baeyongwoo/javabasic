import java.util.Scanner;

class calculator{
	
	public void calcu(int dan) {
		for(int i = 1; i <= dan; i++) {
			for(int j = 2; j <=dan; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}
public class For5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇단 까지 출력할까요?");
		int max_dan = scan.nextInt();
		
		calculator dan = new calculator();
		dan.calcu(max_dan);
		
//		for(int i = 1; i <= max_dan; i++) {
//			for(int j = 2; j <=max_dan; j++) {
//				System.out.printf("%d * %d = %d\t", j, i, i*j);
//			}
//			System.out.println();
//		}
	}
	
}
