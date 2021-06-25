package accessmodifier3;

public class Main2 {
	public static void main(String[] args) {
		// 다른패키지에서 상속 받는 Child2를 확인
		Child2 child2 = new Child2();
		
		//public
		System.out.println(child2.a);
		//protected는 같은 패키지, 혹은 다른 패키지일때 상속관계일떄 접근 가능
		//System.out.println(child2.b);
		System.out.println(child2.e);	//접근
		child2.e = 100;					//변경
		System.out.println(child2.e);
		
		child2.SetB(5);
		System.out.println(child2.getB());
		
		//private
		//System.out.println(child2.c);
		//default	패키지 같으면 접근 가능
		//System.out.println(child2.d);
		
	}
}
