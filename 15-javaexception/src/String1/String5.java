package String1;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		//.length()와 charAt()을 활용해 입력된 전체 문자열을
		// 한글짜씩 한줄씩 출력하는 로직
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String st = scan.nextLine();
		
		int i = 0;
		char c;
		while(true) {
			
			try {
				if(st.length() >= 0) {
					 c = st.charAt(i);
					 i++;
					System.out.println(c);
				}else break;
			} catch (Exception e) {
				e.getMessage();
				break;
			}
		}
		System.out.println("입력하신 글자의 길이는 : " + st.length());
	}
}
