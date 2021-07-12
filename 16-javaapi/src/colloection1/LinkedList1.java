package colloection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
	public static void main(String[] args) {
		//LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있다
		//일반적인 상황에선 ArrayList를 더 많이 사용, 사용법에는 큰 차이가 x
		List<String> list1 = new LinkedList<String>();
		list1.add("java");
		list1.add("jsp");
		list1.add("spring");
		list1.add("springboot");
		System.out.println(list1);
		//deeptToString으로 string으로 변환 시켜준 후 대문자 변환
		String str = Arrays.toString(list1.toArray());		//deepToSTring과 String의 차이점?
															//얕은복사, 깊은복사같은 개념
		str = str.toUpperCase();
		System.out.println(str);
		
		System.out.println(list1);
		// .remove()는 두 유형
		// .remove(번호)를 넣을 경우 주어진 번호에 있는 자료가 삭제
		// .remove("자료")를 입력하면 번호와 상관없이 자료가 삭제
		list1.remove(0);	//0번 인덱스 "자바" 삭제
		System.out.println(list1);
		list1.remove("spring");
		System.out.println(list1);
		
		//리스트를 전체적으로 비우고 싶을땐 clear()를 사용
		list1.clear();
		System.out.println(list1);
		
		//4개 자료 아무거나 추가
		list1.add("딸기");
		list1.add("포도");
		list1.add("복숭아");
		list1.add("사과");

		Collections.sort(list1);
		System.out.println(list1);
 	}
}

//		질문 - list안에 있는 문자열들을 전부 대문자나 소문자로 
