package polymorphism;

public class teacher extends Person{
	private int year; //교사 생활
	private String subject;
	
	public teacher(String name, int age, int year, String subject) {
		super(name, age);
		this.year = year;
		this.subject = subject;
		
	}
	
	public void showtecher() {
		super.showPerson();
		System.out.println("담당 과목 : " + subject);
		System.out.println("교사 생활  : " + year);
	}
	@Override
	public void showPerson() {
		super.showPerson();
		System.out.println("담당 과목 : " + subject);
		System.out.println("교사 생활 : " + year);
		System.out.println("자식 클래스");
	}
	
}
