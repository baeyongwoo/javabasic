package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		//Random 객체를 생성한 다음 nextBoolean() 기능을 이용해서
		//동전던지기 카운팅 프로그램 제작
		//n회 던졋을때 true = 앞면, false = 뒷면으로 간주
		//프로그램이 다 끄났을때 앞면 몇회, 뒷면 몇회인지
		//콘솔에 출력
		
		Random random = new java.security.SecureRandom();
		
		int front_count = 0;
		int back_count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 몇번 던지겠습니까? ");
		int throgh = scan.nextInt();
		
		boolean flag = true;
		boolean b;
		System.out.println("동전 던진 횟수는 : " + throgh + "입니다.");
		while(flag) {
			
			if(random.nextBoolean()) {	//앞면일 경우
				front_count++;
			}else {
				back_count++;
			}
			
			throgh--;
			
			if(throgh == 0) flag = false;
			
			
		}
		
		System.out.println("앞면나온 횟수는 : " + front_count + 
				"이고 뒷면나온 횟수는 : " + back_count + "입니다");
		
		
		
		
	}
}
