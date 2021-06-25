package polymorphism;

public class Principal extends Person{
	private String school_name;
	
	public Principal(String name, int age, String school_name) {
		super(name, age);
		this.school_name =school_name;
	}
	
	public void showPrincipal() {
		super.showPerson();
		System.out.println("소속 학교 : " + school_name);
	}
	@Override
	public void showPerson() {
		super.showPerson();
		System.out.println("t소속 학교 : " + school_name);
	}
}
