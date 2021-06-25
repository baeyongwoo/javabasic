public class For4 {
	public static void main(String[] args) {
		//중첩 반복문은 반복문을 반복시키는 구문
		//실행 횟수는 바깥쪽 반복문 횟수 * 안쪽반복문 횟수
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(i * j);
			}
		}

	}
}
