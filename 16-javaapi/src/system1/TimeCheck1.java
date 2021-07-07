package system1;

public class TimeCheck1 {

	public static void main(String[] args) {
		//currentTimeMills의 자료형은 long형에 저장
		//시작지점
		long start = System.currentTimeMillis();
		System.out.println(start);
		long all = 0;
		
		for(int i = 0; i < 200000000; i++) {
			all += i;
		}
		
		//끝나는 지점
		long  end = System.currentTimeMillis();
		System.out.println(end);
		//소요 시간 측정
		System.out.println(end - start);
	}

}
