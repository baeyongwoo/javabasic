package interface1;

public class Airplane implements Vehicle{

	private int speed;
	private String name;
	private int fuel = MAX_GAS;
	
	public Airplane(String name) {
		this.speed = speed;
		this.name = name;
		this.fuel = fuel;
	}
	
	@Override
	public void Accel() {
		if(speed + 100> 1300) {
			System.out.println("최대 시속은 1300입니다.");
			speed = 1300;
		}else {
			speed += 100;
			fuel -= 100;
		}
	}

	@Override
	public void breakSpeed() {
		if(speed - 100 < 0) {
			System.out.println("시속은 0 미만으로 불가능합니다.");
			speed = 0;
		}else speed -= 100;
		
	}
	@Override
	public void reFuel() {
		if(fuel > MAX_FUEL) {
			System.out.println("주유 범위를 초과하였습니다.");
			fuel = MAX_FUEL;
		}else fuel += 300;
		
	}

	@Override
	public void showStatus() {
		System.out.println("비행기 시속 : " + speed);
		System.out.println("항공사  : " + name);
		System.out.println("비행기 연료 : " + fuel);
		
		
	}


}
