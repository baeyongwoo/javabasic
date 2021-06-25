import java.util.Arrays;

public class foreach1 {
	public static void main(String[] args) {
		//
//		형태
//		for (String string : args) {
//			
//		}
		int[] arr1 = {100, 211, 339, 475, 591};
		
		
		System.out.println(Arrays.toString(arr1));
		
		
		for (int i : arr1) {
			System.out.println(i);	
		}
		System.out.println("-------------------");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
		
	}
}
