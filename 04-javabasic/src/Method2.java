public class Method2 {
	
	public static int add2(int a) {
		return a + 1;
	}
	public static void main(String[] args) {
		//반환 자료가 void가 아닌 경우 호출 위치에
		//return문 오른쪽 자료를 그대로 갖다 놓습니다.
		//자료를 바노한하는 것이 꼭 console창에 표시됨 의미는 x
		int b = add2(10);
		System.out.println(b);
	}
}
