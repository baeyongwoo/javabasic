package constructor;

public class Main2 {
	public static void main(String[] args) {
		Student st1 = new Student("김철수", 23, 56);
		Student st2 = new Student("홍길동", 20, 77);
		System.out.println("===========점수 조회 ================");
		st1.getInfo();
		st2.getInfo();
		
		
		
		System.out.println("============합격 여부 ================");
//		System.out.printf("수험생 " + st1.getName() + "은/는 ");
		st1.getPass(st1.getName(),st1.getScore());
		//System.out.printf("수험생 " + st2.getName() + "은/는 ");
		st2.getPass(st1.getName(),st2.getScore());
		
	}
}
