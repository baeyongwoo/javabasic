class number{
	
	
	String Promiss(int a){
		
		if(a == 15) {
			return "15입니다.";
		}else {
			return "15가 아닙니다.";
		}
	}
}
public class ifElse1 {
	public static void main(String[] args) {
		//if ~ else 구문은 참일때 실행할 구문과 거짓일 때 실행할 구문을 함께 작성
		//if ~ else 구문은 한 구문으로 간주 연산횟수를 절약
		//else문 없이 단독으로 쓰일수 없다.
		//else문은 조건식을 작성할 필요 없음
		
//		int a = 14;
//		
//		if (a == 15) {
//			System.out.println("15입니다");
//		}else {
//			System.out.println("15가 아닙니다.");
//		}
		number num = new number();
		int a = 15;
		System.out.println(num.Promiss(a));
		
		
		
		
		
		
		
		
	}
}
