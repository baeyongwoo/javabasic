import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		//배열은 일반 변수와 달리 하나의 변수명에 여러 값을
		//입력할 수 있고 자료형에 []를 붙이는 것으로 선언
		//배열은 크기를 정해서 생성할수도 있고, 정하지 않고 생성할수도 있음
		//설정된 크기 이상으로 자료를 넣을수 없다
		//배열의 크기(저장가능개수)는 "배열의 길이"라 표현
		//배열명.length를 이용해 배열의 크기를 알수 있음
		
		//배열의 선언1(길이 확정 x)
		int a[] = {1, 2, 3, 4};
		System.out.println(a);
		//배열의 선언2(길이 확정)
		int[] b = {5, 6, 7, 8}; 
		System.out.println(b);
		
		// 배열의 생성(길이 확정) 
		int [] c = new int[8];
		System.out.println(c);
		
		//배열의 길이는 .length로 알 수 있음
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
		
		//주소값이 아닌 배열 전체를 볼 때는
		//Arrays.toString()을 사용
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		
		for(int z : c) {
			System.out.print(z);
		}
 		
	}
}
