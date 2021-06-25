package structure;

public class Person {
	//자바에서 표현할 사람의 필수 정보를 변수로 선언
	//이름 , 나이, 폰번호를 필수 정보로 지정
	//public은 지금 단게에선 무조건 붙여준다
	public String name;
	public int age;
	public String pNum;
	public String address;
	public Person(String name, int age, String pNum, String address) {
		super();
		this.name = name;
		this.age = age;
		this.pNum = pNum;
		this.address = address;
	}
	
	
	
}
