import java.util.Scanner;

public class if2 {
	public static void main(String[] args) {
		
	
		//	주어진 변수 a에 스캐너로 정수밗을 입력받게 
		// 입력받은 정수가 0 이상이면 0보다 크거나 같습니다 를 콘솔에
		// 그렇지 않다면 0보다 작습니다를 콘돌에
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = scan.nextInt();
		
		if(a >= 0) {
			System.out.println("0보다 크거나 같습니다");
		}
		if(a < 0) System.out.println("0보다 작습니다.");
		
//		}else
//		{
//			System.out.println("0보다 작습니다.");
//		}
//		
		
		
		
	}
}
