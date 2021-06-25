package structure;

public class ClassMain {

	public static void main(String[] args) {
		PersonClass p1 = new PersonClass("홍길동", 23, "010-1234-5553", "서울", true);
		PersonClass p2 = new PersonClass("신남이", 27, "010-1111-3333", "경기", false);
		
		p1.Personinfo();
		System.out.println("===============");
		p2.Personinfo();
		
		
	}
}
