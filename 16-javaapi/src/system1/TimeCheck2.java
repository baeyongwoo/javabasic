package system1;

import java.util.Scanner;

public class TimeCheck2 {

	public static void main(String[] args) {
		//tryCatch구문의 소요시간을 구하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1번 정수를 입력 >");
		int num1 = scan.nextInt();
		System.out.print("2번 정수를 입력 >");
		int num2 = scan.nextInt();
		
		long start = System.currentTimeMillis();
		long all = 0;
		try {
			System.out.println(num1 / num2);
			System.out.println("계산 끝");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		long  end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end - start));
	}

}
