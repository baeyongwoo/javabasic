package constructor;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		System.out.println("성적 입력 완료");
		System.out.println("이름 : " + name 
							+ " 나이 : " + age
							+ " 점수 : " + score);
		
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
	public void getPass(String name, int score) {
		if(score >= 60) {
			System.out.println("수험생\t" + getName()+ "은/는 \t합격입니다.");
		}else System.out.println("수험생\t" +getName() + "은/는 \t불합격입니다.");
	}
	
}
