import java.util.Scanner;

public class Bonus2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("4~n까지의 범위를 입력해주세요");
		int n = scan.nextInt();

		boolean isOk;
		int count = 0;
		//소수 2, 3, 5, 7, 11, 13 ,17
		for(int i = 4; i <= n; i++) {//입력받은 수 까지
			isOk = false;
			for(int j = 2; j < i ; j++) {//나눌수
				if(i%j==0) {	//나누어 떨어질 수 갯수 판별
					isOk = true;
					 //나누어 떨어지는 수가 있으면 소수가 아니기 때문
				}
				if(i -1 == j && !isOk)  System.out.println(i);		
			}

		}

	}
}
