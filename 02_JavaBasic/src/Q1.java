
public class Q1 {

	public static void main(String[] args) {
		//다음 로직대로 전위, 후위수식을 이용해 코드를 작성, 전위, 후위 수식 코드는
		//Unary01.java처럼 두단계로 주석으로 풀어서 설명도 하세요
		int a = 15;
		System.out.println(a--);
		//1. a = 15
		//2. a = 15 - 1
		System.out.println(a);
		//1. a 14
	
		System.out.println(--a);
		//13
		System.out.println(a);
		//13
	}
}
