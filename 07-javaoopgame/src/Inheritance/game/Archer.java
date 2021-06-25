package Inheritance.game;

public class Archer extends Commoner{
	public int Street;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();//부모 클래스의 멤버를 참조
		System.out.println("거리에 따른 데미지  : " + Street);
	}
	
}
