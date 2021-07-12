package colloection1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	
	
		static public int MAX = 3;
		
		
	public static void main(String[] args) {
		//로또복권 추첨기 1~45이하의 범위에서 겹치는 숫자없이
		//6개의 숫자를 뽑기
		//순서를 정렬해서 출력
		//ArrayList의 정렬은 .sort()대신
		//Collections.sort(리스트);를 이용해 정렬

		List<Integer> lotto = new ArrayList<>();
		List<Integer> lotto_buyer = new ArrayList<>();
		Random ran = new java.security.SecureRandom();
		DecimalFormat df = new DecimalFormat("#억,####만,####원");
		boolean flag = true;
		int get = 0;
		//int bonus = 0;
		int buyer = 0;
		long money = 0;
		
		while(flag) {
			if(lotto_buyer.isEmpty()) {
				System.out.println("로또 뽑는 중 입니다.");
			}
			buyer = ran.nextInt(45) + 1;

			if(!lotto_buyer.contains(buyer)) {	//contains = > lotto안에 get이 있는지 조회
				lotto_buyer.add(buyer);
			}


			if(lotto_buyer.size() >= MAX) {
				flag = false;
			}
		}
		Collections.sort(lotto_buyer);
		System.out.println(lotto_buyer);
		System.out.println("로또 뽑기 성공");

		flag = true;
		while(flag) {
			while(flag) {
				if(lotto.isEmpty()) {
					System.out.println("로또 구매 중입니다.");
				}
				get = ran.nextInt(45) + 1;

				if(!lotto.contains(get)) {	//contains = > lotto안에 get이 있는지 조회
					lotto.add(get);
				}


				if(lotto.size() >= MAX) {
					flag = false;
				}
			}
			Collections.sort(lotto);
			System.out.println(lotto);
			System.out.println("로또 구매 성공");

			flag = true;

			
			if(lotto_buyer.equals(lotto)) {
				System.out.println("1등 당첨번호");
				System.out.println(lotto_buyer);
				System.out.println(lotto);
				String sum = df.format(money);
				System.out.println("누적금액 : " + sum + "원");
				flag = false;
			}else {
				lotto.clear();
				money += 10000;
			}

		}



	}
}













//if(!lotto.contains(bonus)) {
//lotto.add(bonus);
//System.out.println("2등 당첨번호 : " + bonus);
//}
