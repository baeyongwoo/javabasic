package arrays1;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		//이진 탐색은 데이터가 오름차순으로 정렬되어 있으며
		//배열요소 내부에 중복되는 값이 없어야 최상의 성능을 보임
		//대신 조건을 모두 만족하는 경우 조회 속도가 가장 빠름
		int[] arr1 = {5, 7, 6, 1, 3, 9, 0, 12};
		
		//Arrays.binarySearch(배열명, 찾는 값)
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		
		//정렬이 된 상태의
		Arrays.sort(arr1);
		int b = Arrays.binarySearch(arr1, 12);
		System.out.println(Arrays.toString(arr1));
		System.out.println(b);
		
	}
}
