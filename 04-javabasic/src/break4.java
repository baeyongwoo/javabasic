import java.util.Scanner;

public class break4 {
	public static void main(String[] args) {
		//Scanner로 정수 입력
		//1~n까지 순서대로 더했을떄
		//1부터 몇가지 더해야 입력된 정수를 초과하는지 계산

		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int end = scan.nextInt();
		
		int i = 1;
		int sum = 0;
		int count =0;
		//		for(int i = 1; i <= end; i++) {
		//			sum +=i;
		//			count++;
		//			System.out.println("1부터" + count + "까지의 총합은 : " + sum + "입니다.");
		//			if(sum > end) break;
		//		}
		while(true) {
			
			sum += i;
			i++;
			count++;
			System.out.println("1부터" + count + "까지의 총합은 : " + sum + "입니다.");
			if(sum > end) break;
			
			
		}
		System.out.println("목표값 : " + end);
		System.out.println("총 합 : " +sum);
		System.out.println("몇 까지 더 했나? " + count);
	}
}
