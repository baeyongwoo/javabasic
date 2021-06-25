public class DoWhile1 {
	public static void main(String[] args) {
		//do ~wihle문은 while문과 기본적으로 똑같음
		//단, 첫번째 바퀴만큼은 조건 비교없이 바로 실행하고
		//이후 두 번째부턴 각 바퀴마다 비를 통해 추가 실행여부를 결정
		
		int a = 1;
		do {
			a+=2;
			System.out.println("a는 5보다 작다??");
			
		}while(a < 1);
	}
}
