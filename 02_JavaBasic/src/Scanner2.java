import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("what u are name? : ");
		String name = input.nextLine();
		
		System.out.print("what u are height? : ");
		double height = input.nextDouble();
		
		System.out.println(name + height);
		input.close();
	}
}
