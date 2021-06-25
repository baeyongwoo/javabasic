import java.util.Scanner;
class Square{
	public void Cal(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class For6 {
	public static void main(String[] args) {
		//Scanner로 정수 입력
		// 입력받은 정수의 제곱형태의 직사각형
		//중첩
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요");
		int num = scan.nextInt();
		
		Square square = new Square();
		square.Cal(num);
	}
}
