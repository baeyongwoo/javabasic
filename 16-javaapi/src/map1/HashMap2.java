package map1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
	public static void main(String[] args) {
		//식당 메뉴판 만ㄴ들기
		//key는 음식이름, value는 가격(정수)로 저장
		//메뉴는 5개이상
		//메뉴를 3개 조회해서 화면에 출력
		Scanner scan = new Scanner(System.in);

		Map<String, Integer> menu = new HashMap<String, Integer>();

		menu.put("닭볶음", 15000);
		menu.put("치킨", 20000);
		menu.put("닭도리탕", 22000);
		menu.put("닭갈비", 13000);
		menu.put("닭이닭", 50000);


		System.out.println(menu);

		System.out.println(menu.get("닭볶음"));
		System.out.println(menu.get("닭갈비"));
		System.out.println(menu.get("닭도리탕"));

	}
}
