import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//환율 계산기를 만들어보겠스빈다.
		//네이버에 검색해서 원하는 국가 화폐의 환율을
		//rate 변수에 저장
		//스캐너를 이용해서 won 변수에 원화 금액을 입력
		//원화와 환율을 이용해
		//원화 xxx원을 환전시 xxx화폐입니다.
		
		double rate = 1242.92;
		
		System.out.print("스위스의 환율은  " + rate + "입니다.");
		System.out.println();
		System.out.println("원화를 입력해주세요 .");
		int won = input.nextInt();
		
		System.out.println("원화 " + won + "원을  스위스 프랑으로 환전시\n" 
		+ (double)Math.round((won/rate)*100)/100 + "프랑입니다.");

		
		input.close();
	}

}
