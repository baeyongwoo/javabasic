import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		System.out.print("입력하신 정수는 : ");
		System.out.println(a);
		
		scan.close();
	}
}
