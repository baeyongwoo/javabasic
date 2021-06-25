
public class Unary02 {
	public static void main(String[] args) {
		//단항 연산자로 쓰인 +, -는 양수 음수 표시에 사용
		System.out.println(+50);
		System.out.println(-22);
		//비트 반전 연산자는 비트단위에서 0 -> 1로, 1 -> 0으로
		System.out.println(~1);
		//논리 반전 연산자는 !는 true <-> false 상호 변환
		System.out.println(!true);
		//자료형을 바꿔주는 cast연산자(자료형(자료))
		System.out.println((double)21);
	}
}
