package structure;

public class PersonClass {
	//사람의 정보
	public String name;
	public int age;
	public String pNum;
	public String address;
	public boolean job;
	
	public PersonClass(String name, int age, String pNum, String address, boolean job) {
		super();
		this.name = name;
		this.age = age;
		this.pNum = pNum;
		this.address = address;
		this.job = job;
	}

	//추가로 아까의 조회 메서드를 생성
	//클래스 내부에 생성할 대는 static이 필요 없다
	//클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능
	public void  Personinfo() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
		System.out.println("휴대전화 : " + pNum);
		System.out.println("주소 : " + address);
		System.out.println("취업 여부 : " + job);
	}
}

