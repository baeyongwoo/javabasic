import java.util.Random;

public class SwitchCase2 {
	public static void main(String[] args) {
		//Math.random(); 을 사용해 난수를 하나 발급받고
		//난수의 범위 0초과 1 미만
		//뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을수있다
		double number = Math.random() * 10;
		int intnum = (int)(Math.random() * 6 + 1);	//1~10
		//System.out.println(number);
		System.out.println(intnum);
		
		//switch~Case문을 이용해서 
		//식당 이름을 랜덤하게 출력하는
		//프로그램을 만드세요(최소 6개)
		
		
		switch (intnum) {
		case 1:
			System.out.println("A요리");
			break;
		case 2:
			System.out.println("B요리");
			break;
		case 3:
			System.out.println("C요리");
			break;
		case 4:
			System.out.println("D요리");
			break;
		case 5:
			System.out.println("E요리");
			break;
		case 6:
			System.out.println("F요리");
			break;
		
		}
		
		
		
	}
}
