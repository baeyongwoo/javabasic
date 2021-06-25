
public class Casting {
	public static void main(String[] args) {
		//서로 다른 자료형 간에는 원래 연산이 불가능
		//그렇지만 편의상 컴퓨터가 자동을 자료형을 보정해주는 것이 자료형 변환
		//자동 형 변환 promotion
		//강제 형 변환 casting
		//자동형은 작은 > 큰 범위에 맞출 때
		//강제형은 큰 > 작은 범위에 맞출 때
		int a = 5;
		double b = 7.12;
		double sum = a + b;
		System.out.println(sum);//자동	double
		
		System.out.println(a + (int)b);//강제 int
		byte c = (byte) 494546;
		System.out.println(c);
		
		
		
		
	}
}
