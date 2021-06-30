package interface1;

public class Main1 {

	public static void main(String[] args) {
		//자동차 생성 및 사용
		//생성시 Car타입 하나와
		//Vehicle 타입 하나
		
		Car car = new Car("홍길동");
		car.showStatus();
		car.Accel();
		car.Accel();
		car.showStatus();
		
		Vehicle car2 = new Car("비히차");
		
		car2.showStatus();

	}

}
