import java.util.Scanner;

class cal{
	int num ; 

	public void calf(int num){
		if(num >9 || num < 1) {
			System.out.println("범위 내의 수를 입력해주세요");
			System.exit(0);
		}
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}

public class For3 {
	public static void main(String[] args) {
		//구구단 출력기를 만들자
		//1~9중 하나의 숫자를 입력받습니다.
		//만약 1~9범위를 벗어난 숫자가 입력된다면
		//"범위 내의 수를 입력해주세요"라는 안내문구를 적고 종료합니다
		//맞는 숫자가 들어오면 결과예시처럼 출력합니다
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1~9중 하나를 입력하세요 : ");
		int num = scan.nextInt();
		cal dan = new cal();		
		dan.calf(num);
		
//		if(num >9 || num < 1) {
//			System.out.println("범위 내의 수를 입력해주세요");
//			System.exit(0);
//		}
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d\n", num, i, num*i);
//
//
//		}
	}
}
