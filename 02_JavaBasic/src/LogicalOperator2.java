public class LogicalOperator2 {

	public static void main(String[] args) {
		// &&, || 는 short circuit(단축검정) 연산자
		// &, |와 똑같이 작동하되,
		// 왼쪽 조건식만으로 최종결과가 확정된 경우
		// 추가 연산을 수행 x
		System.out.println(( 1 + 3 > 4) && (0 < 3/0));
		System.out.println(( 5 > 4) || (0 < 2/0));
	}
}
