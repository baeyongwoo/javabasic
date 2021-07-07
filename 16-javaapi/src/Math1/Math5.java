package Math1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Math5 {

	public static void main(String[] args) {
		//주사위 게임
		//주사위 게임 내 값은 myValue변수에
		//컴퓨터값은 comValue변수에 값을 난수 발생으로 1~6번위로 부여후
		//값이 같으면 무승부, 아니면 승자판별
		Random random = new SecureRandom();
		int win = 0;
		int drow = 0;
		int lose = 0;

		boolean flag = true;
		while(flag) {
			int myValue  = random.nextInt(6) + 1;
			int comValue = random.nextInt(6) + 1;

			System.out.println("나의 다이스 값 : " + myValue);
			System.out.println("컴퓨터의 다이스 값 : " + comValue);

			System.out.println("게임결과 ");
			
			if(myValue==comValue) {
				System.out.println("무승부");
				drow++;
			}else if(myValue > comValue){
				System.out.println("내가 이겼다");
				win++;
			}else {
				System.out.println("내가 졌다.");
				drow++;
			}
			
			Scanner scan = new Scanner(System.in);
			System.out.println("그만하실려면 s눌러주세요, 계속하시려면 다른키 입력하세요");
			String stop = scan.next();
			if(stop.toUpperCase().equals("S")) {
				flag = false;
				System.out.println("전적 승 : " + win + ",무 : " + drow + ", 패 : " + lose);
			}

		}

	}

}
