package inheritance;

public class Main1 {

	public static void main(String[] args) {
		//Student가 Person을 상속했기 때문에
		//Student는 Person의 자원을 사용할수 있음
		Student s1 = new Student();
		s1.setName("배용우");
		s1.setAge(20);
		s1.major = "컴퓨터 공학";
		
		s1.getPersonInfo();
		s1.getStudentInfo();

	}

}
