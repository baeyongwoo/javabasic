import java.util.Scanner;

public class Method6 {
	// mul 메서드를 선언해주세요
	//이 메서드는 임의로 이름붙인 정수 변수 3개를 입력받아
	//변수 3개를 곱한 값을 return
	
	//info 메서드를 선언 void 리턴자료형
	//이 메서드는 내부에서 
	//"안녕하세요"
	//"자바 메서드 학습중입니다."
	//"3줄을 한 번의 호출로 적습니다."라는 문장을 출력
	public static int mul(int x, int y, int z) {
		return x * y * z;
	}
	
	public static void info() {
		System.out.println("안녕하세요");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("3줄을 한번의호출로 적습니다.");
		
	}
	public static void main(String[] args) {
		//mul을 호출해 결과값을 int result에 저장하기
		//저장된 값 콘솔창에 출력
		
		//info 메서드 반복문으로 3번 호출
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 3가지 ");
		int result = mul(scan.nextInt(),scan.nextInt(), scan.nextInt());
		
		System.out.println(result);
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			info();
		}
	}
}
