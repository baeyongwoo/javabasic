package accessmodifier2;

public class Main {
	public static void main(String[] args) {
		//Parent를 상속받은 Child 내부의 자료 조회
		Child c = new Child();
		//1. public 자료
		System.out.println(c.a);
		//2. protected 자료
		//현재 Main.java와 같은 패키지 내부에 Parent , Child
		//가 존재하므로 protected 접근가능
		System.out.println(c.b);
		//3. private 자료
		//System.out.println(c.c);
		
		System.out.println(c.d);
		
	}
}
