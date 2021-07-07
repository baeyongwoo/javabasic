package arrays1;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		//Arryas.copyOfRange()는 copyOf()와 비슷하지만
		//시작지점까지 같이 지정해서 복사가능
		//단, 이 경우도 시작지점은 입력값
		//끝 지점은 입력한 값 직전까지
		
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7);
		System.out.println(Arrays.toString(arrCopy));
		
		int [] arrCopy2 = Arrays.copyOfRange(arr, 5, 12);
		System.out.println(Arrays.toString(arrCopy2));
	}
}
