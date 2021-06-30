package exception2;

import java.util.Scanner;

public class ifElse {
	//int a, b에 스캐너로 각각 정수 입력을 받기
	// a / b의 결과를 콘솔창에 띄워주시되
	//if ~ else문을 이용해 0으로 나누는 에러발생이 일어나기 전에
	//나누는 수에는 0을 입력할 수 없습니다
	//라는 경고
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 a, b를 입력 >");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b==0) {
			System.out.println("by zero");
		}else System.out.println("결과값 : " + a / b);
	}
}
