package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// Map자료형의 대표 자료형은 HashMap입니다
		// 제네릭 내부에는 <key자료형, Value자료형>으로 작성.
		Map<String, String> map = new HashMap<String, String>();
		//자료형이 달라도 상관없음
		//Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		//왜 출력이 순서가 2-3-1순일까?
		map.put("배용우", "java");
		map.put("홍길동", "축지법");
		map.put("감자", "대홍단");
		System.out.println(map);
		
		//자료조회시는 .get(키값)으로 조회
		//map은 키로 벨류를 조회하는 것은 가능하지만, 역은 불가능
		//없는 키값으로 조회하면 null이 나옴
		//인덱스번호도 존재하지 않음
		System.out.println(map.get("배용우"));
		System.out.println(map.get("감자"));
		System.out.println(map.get(0));
		
		//기본적으로 map자료형은 조회도 key중심으로 이뤄짐
		// .containsKey()는 해당 키값이 자료내에 존재하는지 확인
		System.out.println(map.containsKey("배용우"));
		System.out.println(map.containsKey("홍"));
		
		//remove는 key를 이용해서 key=value 전체를 삭제함
		map.remove("감자");
		System.out.println(map);
		
		//.size()는 크기를 알려줌, 정수로 몇개의 key=value쌍이 저장된지 확인
		System.out.println(map.size());
		
	}

}
