package overloading;

public class OverTest {
	private String a;
	private int b;
	
	//main메서드가 없는 java class 파일에는
	//static을 붙이지 않습니다.
	
	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	OverTest(){
		 setA("0");
		 setB(1);
	};
	OverTest(String a){
		setA(a);
		setB(2);
	}
	OverTest(int b){
		setA("3");
		setB(b);
	}
	OverTest(String a, int b){
		setA(a);
		setB(b);
	}
	
	public void showData(){
		System.out.println("A : " + getA());
		System.out.println("B : " + getB());
		System.out.println("====================");
	}
}
