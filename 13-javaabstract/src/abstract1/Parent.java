package abstract1;

public abstract class Parent {
	public int a;
	
	public Parent() {
		this.a = 5;
	}
	
	public abstract void getA();
	
	public void getInfo() {
		System.out.println("일반 메서드 입니다.");
	}
}
