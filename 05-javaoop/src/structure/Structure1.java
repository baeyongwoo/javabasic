package structure;

public class Structure1 {

	public static void main(String[] args) {
		
		// Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person a = new Person("홍길동", 25,"010-1333-1444", "서울");
		// a라는 구조체에 이름, 나이, 폰번호를 입력합니다.
		a.name = "배용우";
		a.age = 25;
		a.pNum = "010-1234-5678";
		a.address = "서울시";
		// 입력된 자료를 하나하나 출력합니다.
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		System.out.println(a.address);
		
		
		
	}
}
