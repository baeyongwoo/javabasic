import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		//스캐너를 이용해서 String num 변수에
		//"문자열 형태인 숫자를" 입력받게 해주세요.
		//이 문자자료 num을 int loop 변수에 정수로 변환해 저장하세요
		//loop 변수에 입력된 정수 횟수만큼
		//"반복문을 실행합니다(횟수)" 라는 문장이 콘솔에 출력
		//while
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		String num = scan.next();
		int loop  = Integer.parseInt(num);
		int number = 0;
		while(number < loop) {
			
			number++;
			System.out.println("반복문을 실행합니다\t" + number);
			
		}
	}
}
