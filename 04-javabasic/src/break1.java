public class break1 {
	public static void main(String[] args) {
		//break문은 반복문 내부에서 실행될 경우 즉시 반복문을 종료
		//break문은 중첩 반복문에서 사용시 전체 반복문을 종료x
		//breka문이 속해 잇는 영역까지만 종료
		int a = 1;
		int[] arr = {9, 8, 7, 6, 1, 4, 3, 2, 1};
		
		for(int num : arr) {
			if(a == num) {
				System.out.println("1이 나와서 종료합니다.");
				break;
			}
			System.out.println("이번 숫자는" + num + ".");
		}
 	}
}
