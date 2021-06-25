public class Ternary {
	public static void main(String[] args) {
		//삼항 연산자는 (조건식 ? 결과1 : 결과2)
		//조건식 결과가 true라면 결과1
		//결과가 false라면 결과2
		System.out.println((3 < 5) ? "참" : "거짓");
		
		int arr[] = new int [5];
		
		for(int i =0; i < 5; i++) {
			arr[i] = i;
		}
		
		for(int z : arr) {
			System.out.println(z);
		}
	}
}
