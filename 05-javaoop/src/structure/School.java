package structure;

public class School {
	//학생정보
	private String name;
	private int age;
	private int score;
	
	public School(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	

	
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




	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("점수 : " + score);
	}

}
