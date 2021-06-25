package Inheritance.game;

public class Warrior extends Commoner{
	//Commoner 상속으로 인해 체력, 마나, 레벨, 아이디 수치는 
	//이미 변수로 기입되어있음
	//전사 클래스는 평민과 달리 물리공격력 수치를 부여받게 해주세요
	public int attack_num;
	//getInfo() 함수를 이름 그대로 다시 재정의
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("물리 공격력" + attack_num);
	}
	//Warrior의 물리데미지 수치까지 같이 콘솔에 찍어주기
	
}
