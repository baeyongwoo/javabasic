package structure;

public class Structure2 {

	public  static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
		
		
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Person a = new Person("홍길동", 25,"010-1333-1444", "서울");
		getInfo(a);
//		
//		Person b = new Person();
//		b.name = "동동동동";
//		b.age = 27;
//		b.pNum = "010-1421-3143";
//		b.address = "경기";
//		getInfo(b);
		
		System.out.println("==========================");
		Cat c1 = new Cat("페르시안", 2, "a");
//		Cat c1 = new Cat();
//		c1.name = "페르시안";
//		c1.age = 2;
//		c1.jong = "A";
		Cat c2 = new Cat("와일드카고", 2, "b");
		c1.getCatInfo(c1);
		c2.getCatInfo(c2);
		
	}
}
