package system1;

public class Exit1 {

	public static void main(String[] args) {
		//System.exit()는 break문처럼 싱행 즉시
		//프로그램 실행을 중단 합니다.
		System.out.println("실행중1");
		System.out.println("실행중2");
		System.out.println("실행중3");
		System.out.println("실행중4");
		System.out.println("실행중5");
		//0정상종료(에러발생x), 0이외에 비정상 종료(에러발생0)
		System.exit(0);
		System.out.println("실행중6");
		System.out.println("실행중7");
	}

}
