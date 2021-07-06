package String1;

public class String10 {

	public static void main(String[] args) {
		//String.valueOf()는 괄호 사이의 자료를 문자열로 바꿈
		String a = String.valueOf(1000);
		System.out.println(a);
		System.out.println(a + 1);
		
		String b = String.valueOf(2231.58924);
		System.out.println(b);
		System.out.println(b + 1);
		
		//String.valueOf()쓰지않고도
		// + ""만으로 문자열화를 시킬 수 있음
		//자바는 문자열 + 다른 자료형을 할 경우 다른 자료들도 전부 문자열화
		String c = 1000 + "";
		System.out.println(c);
		System.out.println(c + 1);
		
	}

}
