package inheritance;

//상속시 고려할 것은 논리구조
//모든 학생은 사람이다(0), 그러나 모든 사람은 학생이다(X)와 같이
//하나의 클래스가 다른 클래스의 바운더리에 완벽히 속하지만 
//그 역이 성립하지 않을 때 상속을 사용
public class Person {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getPersonInfo() {
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세 니다.");
	}
	
}
