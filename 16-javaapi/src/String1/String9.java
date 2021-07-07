package String1;

public class String9 {

	public static void main(String[] args) {
		//기본적으로 문자열은 참조형 변수
		//비교를 할 떄 주소값 비교
		String a = new String("테스트1");
		String b = new String("테스트1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
	}

}
