public class Parseint {
	public static void main(String[] args) {
		//정수자료는 굳이 문자로 바꾸지 않아도
		//System.out.println()구문 내에서  +로 문자와 연결시
		//자동으로 문자로 변경된다
		//그러나 문자 전체가 정수로만 이루어진 문자열을
		//정수로 치환은 Integer.parseInt(문자열);
		
		String str = "2021";
		int year = Integer.parseInt(str);
		
		System.out.println(year + 1); // 2022
		System.out.println(str + 1); //20211
	}
}
