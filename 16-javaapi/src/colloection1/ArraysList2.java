package colloection1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraysList2 {
	public static void main(String[] args) {
		// 여러분들이 직접 String자료를 가변적으로 받을 수 있는
		// ArrayList를 만들고, 안쪽에 자료로
		// "사과", "딸기", "바나나", "블루베리", "파인애플"을 넣어주세요
		
		List<String> eat = new ArrayList<String>();
		eat.add("사과");
		eat.add("딸기");
		eat.add("바나나");
		eat.add("블루베리");
		eat.add("파인애플");
		
		
		System.out.println(eat);
		
		// .contains("자료")는 리스트 내에 찾는 자료가 있으면 true
		// 없다면 false를 출력
		System.out.println(eat.contains("사과"));
		System.out.println(eat.contains("홍차"));
		
		// .get(번호)는 주어진 인덱스에 저장되어 있는 자료를 조회
		System.out.println(eat.get(1));
		// 없는 인덱스번호를 입력하면 예외가 발생해 전체코드가 종료
		//System.out.println(eat.get(10));
		
		List<String> list2 = new ArrayList<String>();//빈 리스트 생성
		// .isEmpty()는 비어있는지 여부를 체크
		System.out.println(eat.isEmpty());
		System.out.println(list2.isEmpty());
		
		System.out.println(eat.size());
		System.out.println(list2.size());
		
		
		
		
		
	}
}
