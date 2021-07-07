package String1;

public class String2 {

	public static void main(String[] args) {
		//indexOf()는 특정 문자열의 시작 인덱스 값을 반환
		//만약 특정 문자열이 포함되어 있지않다면 -1를 리턴
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		System.out.println(get);
		
		//중복문자 처리
		get = tomato.indexOf("to", 1);	//1번째 인덱스부터 시작해라
		System.out.println(get);
		
		//없는 문자열 처리
		get = tomato.indexOf("banana");
		System.out.println(get);
		
	}

}
