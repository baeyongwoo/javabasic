import java.util.Scanner;

public class GetBMI {

	//get BMI 메서드를 만들어주세요

	static double GetBmi(double height, double weight) {

		return weight /Math.abs(height * 0.01);
		//return weight/((height*0.01)*(height*0.01));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		System.out.println("몸무게를 입력해주세요 : ");
		double weight = scan.nextDouble();
		
		
		System.out.println(GetBmi(height,weight));
	}
}
