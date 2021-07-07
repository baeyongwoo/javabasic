package stringbuilder1;

public class Builder3 {

	public static void main(String[] args) {

		//Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제
		//Delete(시작인덱스, 끝인덱스)를 입력하면
		//시작지점부터 끝 지점 사이를 삭제
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		
		System.out.println(a);
		a.delete(3, a.length()-2);
		System.out.println(a);
		
	}

}
