package gbbgame;

public class Com {
	static String [] MNOG = {"가위", "바위", "보"};	//MNOG = Mean Number Of the Game : 경우의 수
	static String show() {
		int i = (int)(Math.random() * 3);	//랜덤 추출
		return MNOG[i];
	}
	
}