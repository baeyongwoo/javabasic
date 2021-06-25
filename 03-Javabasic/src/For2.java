import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//Hello Java 입력한 횟수만큼 출력하는 구문
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇번 출력할까요? ");
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i + "번\t" + "Hello Java");
		}
		
		
	}
}
