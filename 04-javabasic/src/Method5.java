public class Method5 {

	public static void plus(int c, int num) {
		System.out.println(c + num);
	}
	public static void main(String[] args) {
		//중괄호 여닫는 부분 내부를 지역이라고 합니다
		//중괄호 닫히면 해당 지역과 지역 내 자료들은 모두 소멸
		plus(10,20);
//		System.out.println(c);
//		System.out.println(num);
	}
}
