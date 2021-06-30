package interface1;

// 인터페이스는 interface 선언을 사용
// 내부에는 상수 변수, 추상메서드만 선언 할 수 있다.
// 애초에 구현(implements)를 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언 할 수 없다.
public interface Vehicle {
	// 최대 연료량
	int MAX_GAS = 100;
	int MAX_FUEL = 1000;
	
	//탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	//{
	//	실행문..
	//}
	//부분없이 작성
	public void Accel();	//가속
	public void breakSpeed();	//감속
	public void reFuel();	//주유
	public void showStatus(); //계기판 조회
}
