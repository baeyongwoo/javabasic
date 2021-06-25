package inheritance;

//상속 문법
//클래스명칭 오른쪽에 extens <부모클래스이름>을 적는다
//이렇게 상속을 한 클래스는 부모, 자식 클래스가 하나의 객체 내부에
//공존하는 형태로 메모리에 생성
public class Salaryman extends Person{

	//연봉을 추가로 가져감
	public int salary;
	
	public void upSalary() {
		salary += 1000;
	}
	public void getSalaryInfo() {
		// 상속시 부모쪽의 자원을 마음대로 사용 가능
		getPersonInfo();
		System.out.println("연봉은" + salary + "만원입니다.");
	}
}
