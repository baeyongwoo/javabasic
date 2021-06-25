package inheritance;

public class Student extends Person{
	//공통 속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public String major;
	
	//학생 버전의 자기소개
	void getStudentInfo() {
		getPersonInfo();
		System.out.println("학생의 전공은 : " + major + "전공입니다. ");
	}

}
