public class Bnary3 {
	public static void main(String[] args) {
		// 5 => 00000000 00000000 00000000 00000101
		// 3 => 00000000 00000000 00000000 00000011
		//비트 연산자는 비트 행 위 아래를 따져서
		//&는 위아래 모두 1일 때 1
		//|는 위아래 모두 0일 때 0
		//^ 위 아래 다를 때만 1
		System.out.println(5 & 3);
		System.out.println(5 | 3);
		System.out.println(5 ^ 3);
	}
}
