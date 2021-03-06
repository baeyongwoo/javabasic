package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		//부모 타입인 Person만으로도 양쪽 자료형 모두 처리가능
		Person t1 = new teacher("홍길동", 26, 3, "텔레포트");
		Person s1 = new Student("제자", 15, 4);
		//단 메서드는 Person을 베이스 객체는
		//person에 정의된 메서드만 호출가능
		
		t1.showPerson();
		s1.showPerson();
		
		
		Student stu = (Student) s1;	//다운캐스팅해서 stu정보 
		stu.showStduent();
//		
//		teacher tea = (teacher) t1;
//		tea.showtecher();
//		tea.showPerson();
//		//업 캐스팅하면 부모클래스에 잇는것만 볼 수 있고
//		//다운 캐스팅하면 자식클래스에 있는것까지 볼 수 있음
//		
//		Person s2 = (Person) stu;	//학생 클래스인 stu를 다시 Person으로 업캐스팅
//		s2.showPerson();
		
		Person p1 = new Principal("김기장", 50,"자바 고등학교");
		p1.showPerson();
		
		Principal pri = (Principal) p1;
		pri.showPrincipal();
		
		
		
	}
}
