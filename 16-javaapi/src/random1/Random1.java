package random1;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		//Random 클래스는  Math.random()보다 좀 더 간단하게
		//다양한 종류의 난수값을 얻을 수 있도록 도와줌
		//java.utill을 통해 import할 수 있음
		Random random = new java.security.SecureRandom();
		
		boolean result = random.nextBoolean();
		
		System.out.println(result);
	}
}
