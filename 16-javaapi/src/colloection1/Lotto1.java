package colloection1;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	public static void main(String[] args) {
		//로또복권 추첨기 1~45이하의 범위에서 겹치는 숫자없이
		//6개의 숫자를 뽑기
		//순서를 정렬해서 출력
		//ArrayList의 정렬은 .sort()대신
		//Collections.sort(리스트);를 이용해 정렬

		List<Integer> lotto = new ArrayList<>();
		Random ran = new java.security.SecureRandom();
		boolean flag = true;
		int get;


		while(flag) {
			if(lotto.isEmpty()) {
				System.out.println("로또 뽑는 중입니다.");
			}
			 get = ran.nextInt(45) + 1;
			
			if(!lotto.contains(get)) {	//현재 인덱스를 조회해서 비교
				lotto.add(get);
			}
			

			if(lotto.size() >= 6) {
				flag = false;
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);


	}
}
