import java.util.Scanner;
public class ScoreChecker {
	public static void main(String[] args) {

		//성적 판독기를 만들어보겠습니당.
		//if ~ else if ~ else구문을 사용

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		//		
		//		if(score >= 95) {
		//			System.out.println("A+");
		//		}else if(score >= 90){
		//			System.out.println("A0");
		//		} else if (score >= 85) {
		//			System.out.println("B+");
		//		} else if(score >= 80) {
		//			System.out.println("B0");
		//		} else if(score >= 75) {
		//			System.out.println("C+");
		//		} else if(score >= 70) {
		//			System.out.println("C0");
		//		} else if(score >=65) {
		//			System.out.println("D0");
		//		}else {
		//			System.out.println("F");
		//		}
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			}else {
				System.out.println("A0");
			}
		}else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B0");
			}
			
		}else if(score >= 70) {
			if(score >= 75) {
				System.out.println("C+");
			}else {
				System.out.println("C0");
			}
			
		}else if(score >= 60) {
			if(score >= 65) {
				System.out.println("D+");
			}else {
				System.out.println("D0");
			}
		}else {
			System.out.println("F");
		}
	}








}

