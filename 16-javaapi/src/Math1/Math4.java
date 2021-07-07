package Math1;

//import java.security.SecureRandom;
import java.util.Random;

public class Math4 {
	public static void main(String[] args) {
		//Math.random()은 0이상 1미만인 난수를 구해줌
		double a = Math.random();
		System.out.println(a);
		
		//범위를 제한하고 싶은경우(0이상 6미만)
		int b = (int)(Math.random() * 6);
		System.out.println(b);
		
		
		//secureRandom사용
		Random rn2 = new java.security.SecureRandom();
		System.out.println(rn2.nextInt(10)+1);	//0~인자 -1까지	, +하면 초기값 설정 가능 
		
	}
}
