package stringbuilder1;

public class Builder5 {

	public static void main(String[] args) {
		//다음 문자열의 문자를 0부터 시작해서3번째마다 삭제해주세요
		//힌트 : 반복문 사용
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

		System.out.println(a);
		//26 23 20 17 14 11 8 5 2 0
		for(int i = 0; i < a.length(); i++) {
			if(i % 3 ==0) 
				a.deleteCharAt(i);
		}
		System.out.println(a);

	}

}
