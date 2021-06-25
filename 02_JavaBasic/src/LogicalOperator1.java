public class LogicalOperator1 {
	public static void main(String[] args) {
		//논리연산자는 둘 이사으이 논리식을 병렬형태로 제시
		//논리식 1 & 논리식 2의 경우는 양쪽 논리식이 다 true일 경우
		//논리식 1 | 논리식 2의 경우는 한쪽이상이 true인 경우
		//최종 조건식은 true로 판단
		System.out.println((100 > 50) & (30 > 50));
		System.out.println((100 > 50) | (30 > 50));
	}
}
