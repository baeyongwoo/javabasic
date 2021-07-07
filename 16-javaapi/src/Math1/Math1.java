package Math1;

public class Math1 {

	public static void main(String[] args) {
		//Math는 자바에서 이미 기본을 제공하는 기능
		//import없이 가능
		int a = -1024;
		System.out.println(Math.abs(a));
		
		//올림
		double b = 3.14;
		System.out.println(Math.ceil(b));
		//버림
		double c = 19.9;
		System.out.println(Math.floor(c));
		
	}

}
