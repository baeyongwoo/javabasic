package Inheritance.game;

public class Magicion extends Commoner{
	public int AP;
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("마법 데미지 : " + AP);
	}
	

}
