package arrays1;

import java.util.Arrays;


public class Arrays4 {

	public static void main(String[] args) {
		//Arrays.sort(배열); 은 배열 내부 순서를
		//오름차순으로 배치
		int [] arr = {21, 60, 32, 44, 1, 59, 99, 89, 36};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
