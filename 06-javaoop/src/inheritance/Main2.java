package inheritance;

public class Main2 {
	public static void main(String[] args) {
		Salaryman salman = new Salaryman();
		Student stu = new Student();
		
		salman.setName("배용우");
		salman.setAge(25);
		salman.salary = 6000;
		salman.getSalaryInfo();
		salman.upSalary();
		salman.getSalaryInfo();
		System.out.println("-------------");
		stu.setAge(25);
		stu.setName("홍길동");
		stu.major = "컴퓨터공학 ";
		stu.getStudentInfo();
		
	
	}
}
