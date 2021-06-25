package thiskeyword;
public class Person {
	//사람의 정보를 여기에 기입
	public String name;
	public int age;
	public int money;
	public String major;
	
	//생성자를 활용
	public Person(String name, int age, int money, String major) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("소지금액 : " + money);
		System.out.println("전공 : " + major);
	}
	
	
}
