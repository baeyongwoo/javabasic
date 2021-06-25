import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char star = '*';
		char space = ' ';
		System.out.print("별 층수를 입력하세요 : ");
		int dan = scan.nextInt();
//		
//		*
//		**
//		***
//		****
//		*****
		for(int i = 0; i < dan ; i++) {
			for(int j =0; j < i + 1; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("====================");
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for(int i = 0; i < dan; i++) {
			for(int j = 0;j < dan - i -1; j++ ) {
				System.out.print(space);
			}
			for(int j = 0; j < i + 1 ; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("====================");
//		*****
//		****
//		***
//		**
//		*
		for(int i =0; i < dan ; i++) {
			for(int j =0; j < dan - i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("====================");
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i = 0; i < dan; i++) {
			
			for(int j =0; j < i ; j++) {
				System.out.print(space);
			}
			for(int j = 0; j < dan - i; j++) {
				System.out.print(star);
			}
		
				
			System.out.println();
		}
		System.out.println("=====================");
//     *
//    ***
//   *****
//  *******
// *********
		for(int i = 0; i < dan; i++) {
			for(int j =0; j < dan - i -1 ; j++) {
				System.out.print(space);
			}
			for(int j =0; j < i* 2 +1 ;j++) {
				System.out.print(star);
			}
			System.out.println();
		}
// *********	0 9
//  *******		1 7
//   *****		2 5
//    ***		3 3
//     *		4 1
		System.out.println("=================");
		for(int i = 0; i < dan; i++) {
			for(int j =0; j < i; j++) {
				System.out.print(space);
			}
			for(int j =0; j < dan * 2 -1 -i*2 ; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("===================");
	}
	
	
}
