package exception2;

public class TryCatch2 {

	public static void main(String[] args) {
			//exception1 패키지안에 있는 것 중 하나 골라서 try~ catch 하기
		//예외 발생 케이스 4.
		//특정 배열을 만들었을때 배열 인덱스를 초과해서 입력하는 경우
		int[] arr = new int[5];
		for(int i =1; i < arr.length; i++) {
			arr[i] = arr[i];
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스의 크기는 " + arr.length + "입니다.");
			e.getMessage();
		}
		
		
		finally {
			System.out.println("배열 5개 출력완료");
		}
		

	}

}
