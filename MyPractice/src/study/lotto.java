package study;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lotto {
	//1. 로또 번호 추출하는 프로그램을 만들기
	//2. 로또 번호 중복되지 않는 프로그램 만들기
	//3. 2번을 이용해서 당첨번호를 무작위로 하나 뽑아놓고, 무한루프를 이용해서 한번 뽑을 때 마다 1000원씩 지불하며,
	//3-1. 당첨번호와 일치하면 사용한 금액을 출력
	public static final int LOTTOSIZE = 6;
	public static int [] lotto = new int[LOTTOSIZE];	//6개의 배열 생성 0~5번 인덱스


	public static int[] lottoRandom(int [] lotto) {
		for(int i = 0; i < LOTTOSIZE; i++) {	//0~6인덱스에 저장
			lotto[i] = (int)(Math.random()*45) + 1;	//1~45까지 랜덤을 추출해서 i인덱스에 저장
			for(int j =0; j < i; j++) {	//내부 for를 사용해서 중복검사
				if(lotto[i]==lotto[j]) {//중복되는지 검사
					//lotto_ov[j] = lotto[i];
					i--;	//중복되면 하나 감소해서 다시 뽑게 만들기


				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		return lotto;
	}


	public static void main(String[] args) {
		
		while(true) {
			int money = 0;
			int [] buylot = new int[LOTTOSIZE];
			for(int i = 0; i < LOTTOSIZE; i++) {	//0~6인덱스에 저장
				buylot[i] = (int)(Math.random()*45) + 1;	//1~45까지 랜덤을 추출해서 i인덱스에 저장
				for(int j =0; j < i; j++) {	//내부 for를 사용해서 중복검사
					if(buylot[i]==buylot[j]) {//중복되는지 검사
						//lotto_ov[j] = lotto[i];
						i--;	//중복되면 하나 감소해서 다시 뽑게 만들기


					}
				}
				money += 1000;
			}
			
	
			lottoRandom(lotto);
			Arrays.sort(buylot);
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(buylot));
			if(Arrays.toString(buylot).equals(Arrays.toString(lotto))) {
				System.out.println("당첨번호 : " + Arrays.toString(buylot));
				System.out.println("1등되려면 금액 : " + money);
				break;
			}
			
		}
		
		
		




	}
}











