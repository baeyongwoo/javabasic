package String1;

public class String6 {
	
	public static void main(String[] args) {
		//substring()은 인덱스 기준으로 앞 문자열을 삭제
		//인덱스 번호를 두 개 주면 처음 인덱스번호 ~ 두 번째 인덱스번호 사이만 남겨짐
		
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);
		System.out.println(result);
		
		//15가 최대 인덱스인데 15앞에까지만
		result = str.substring(10,15);
		System.out.println(result);
		
	}
}
