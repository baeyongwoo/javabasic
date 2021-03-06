package superclass;

public class Airplane {
	// 비행기는 속도를 가집니다.
	public int speed;
	final int speedup = 500;
	final int speeddown = 100;
	//생성자는 속도를 입력한 값으로 맞춰준다.
	public Airplane(int s) {
		speed = s;
		System.out.println("현재 시속 : " + speed + "km/h로 비행중.");
		
	}
	
	//fly() 메서드르 수행하면 속도가 500씩 증가
	//단, 일반 비행기는 속도가 900이상 될수 없다
	
	public void fly() {
		if(speed +speedup > 900) {
			speed = 900;
		} else {
			speed += speedup;
			
		}
		System.out.println("현재 시속 : " + speed + "km/h로 비행중.");
	}
	//breakSpeed() 메서드를 수행하면 속도가 100씩 감속
	//단, 브레이크 연산 속도 최저선이 0이다
	public void breakSpeed() {
		if(speed - speeddown >= 0) {
			speed -= speeddown;
			
		}else {
			speed = 0;
			System.out.println("시속은 0이하로 내릴 수 없습니다.");
		}
		System.out.println("현재 감속결과 시속 " + speed + "km/h 입니다.");
	}
}
