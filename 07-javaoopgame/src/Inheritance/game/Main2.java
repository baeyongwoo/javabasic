package Inheritance.game;

public class Main2 {
	public static void main(String[] args) {
		//Warrior를 생성해서 각종 스텟을 입력해주신다음
		//getInfo를 호출
		
		//getInfo()호출시 Commner의 getInfo()는 무시
		//warrior의 getInfo부터 우선적
		Warrior w1 = new Warrior();
		w1.setId("zxcv123");
		w1.hp = 500;
		w1.level = 10;
		w1.steminer = 300;
		w1.attack_num = 300;
		w1.getInfo();
	}
}
