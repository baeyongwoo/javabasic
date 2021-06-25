import java.util.InputMismatchException;
import java.util.Scanner;

class calculator{
	int a, b;

	public int plus(int a, int b) {
		return a+b;	
	}
	public int minus(int a, int b) {
		if(a > b) return a - b;
		else return -b + a;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	public int division(int a , int b) {
		return a/b;
	}


}
public class comment {
	public static void main(String[] args) {
		calculator cal = new calculator();
		Scanner input = new Scanner(System.in);

		while(true) {
			int	num1 = 0;
			int	num2 = 0;
			System.out.print("두 숫자를 입력하세요 : ");
			
			try {
				 num1 = input.nextInt();
				 num2 = input.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요!!!");
				
				break;
			}

			System.out.print("연산자는 무엇을 할 까요? ex)+,-,x,/ ===>");
			String	sign = input.next();
			

			switch (sign) {
			case "+":
				System.out.println("두 수의 합 : "+cal.plus(num1, num2));
				break;
			case "-":
				System.out.println("두수의 차 : "+cal.minus(num1, num2));
				break;

			case "*":
			case "x":
			case "X":
				System.out.println("두수의 곱 : "+cal.multi(num1, num2));
				break;

			case "/":
				System.out.println("두수의 몫: "+cal.division(num1, num2));
				break;

			}
			
			System.out.println("계속하시려면 아무거나 입력하시고  그만하시려면 n을 입력");
			String stop = input.next();
			
			if(stop.equals("N")||stop.equals("n")) { 
				System.out.println("시스템 종료합니다.");
				System.exit(0);
				}
			else continue;
				
		}


	}
}
