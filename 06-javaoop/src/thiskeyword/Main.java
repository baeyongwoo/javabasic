package thiskeyword;

public class Main {
	public static void main(String[] args) {
		//this가 적용된 Person 생성하기
		Person p1 = new Person("배용우", 25, 1111, "컴공");
		p1.getInfo();
		System.out.println("------------------------");
		Person p2 = new Person("수리수리", 1592, 0, "마법사");
		p2.getInfo();

	}
}
