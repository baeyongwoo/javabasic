package interface1;

//인터페이스를 구현(상속이 아님!)하기 위해서는
//implement(extends가 아님)키워드를 사용
//인터페이스 내부의 추상메서드는 무조건 구현 해야함
public class Car implements Vehicle{
	//자동차라면 가져야 하는 변수 설정
	//현재 속도, 현재 연료량, 차주
	private int speed;
	private int gas;
	private String owner;
	
	public Car(String owner) {
		this.speed = speed;
		this.gas = MAX_GAS;
		this.owner = owner;
	}
	
	@Override
	public void Accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 
		// 연료는 한 번에 가속에 1씩 소비
		// 단 속도는 200을 초과x
		if(speed + 10 > 200) {
			System.out.println("속도는 200을 초과할 수 없습니다.");
			speed = 200;
		}else speed += 10;
		
		gas -= 1;
	}
	@Override
	public void breakSpeed() {
		// 한 번 감속 씩 속도가 10씩 감소
		// 단 속도는 0 미만이 될수 없다
		if(speed -10 < 0 ) {
			System.out.println("속도는 0 미만으로 내려갈 수 없습니다.");
			speed = 0;
		}else speed -= 10;
		
	}
	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워짐
		// 단 연료 최대값은 상수 MAX_GAS를 이용해서 측정
		if(gas + 30 > MAX_GAS) {
			System.out.println("연료 최대치입니다.");
			gas = MAX_GAS;
		}else gas += 30;
		
		
	}
	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 가스 : " + gas);
		System.out.println("현재 차주 : " + owner);
		System.out.println("==========================");
	}


}
