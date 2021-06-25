import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		//배달 어플을 만듬
		//주문금액을 입력받는다
		//주문 금액이 15000미만이면 프로그램이 멈춥니다
		//주문금액이 Scannner를 이용해 order변수에 직접 입력
		//단, do while로 작성해 첫 주문은 주문금액이 15000미만이여도 
		//배달을 완료했습니다 출력후
		//다시 주문금액을 입력받는 로직

		Scanner scan = new Scanner(System.in);
		int order;

		
		System.out.println("주문금액을 입력해주세요");
		order = scan.nextInt();

		do {
			System.out.println("배달을 완료했습니다.");
			System.out.println("다음 주문을 입력해주세요");
			order = scan.nextInt();
		}while(order > 15000);
	}
}
