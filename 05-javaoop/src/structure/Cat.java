package structure;

public class Cat {

	public String name;
	public int age;
	public String jong;
	public Cat(String name, int age, String jong) {
		
		this.name = name;
		this.age = age;
		this.jong = jong;
	}
	
	public static void getCatInfo(Cat c) {
		System.out.println("고양이 이름 : " + c.name);
		System.out.println("고양이 나이 : " + c.age);
		System.out.println("고양이 종 : " + c.jong);
		
	}
	
}
