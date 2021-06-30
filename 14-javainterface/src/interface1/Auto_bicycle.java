package interface1;

public class Auto_bicycle implements Vehicle{
	private int cycle;
	private String owner;
	private int speed;
	private int gas = MAX_GAS;
	
	public Auto_bicycle(String owner, int cycle) {
		this.cycle = cycle;
		this.owner = owner;
		this.speed = speed;
		this.gas = gas;
	}
	
	
	@Override
	public void Accel() {
		if(cycle ==2) {
			if(speed + 10 >=100) {
				System.out.println("이륜은 속력 100이상 불가능합니다.");
				speed = 100;
			}else {
			speed += 10;
			if(gas - 5 <= 0) {
				System.out.println("연료가 없습니다 연료를 주입해주세요");
				gas = 0;
			}else gas -= 5;}		
		}
	
		if(cycle == 3) {
			if(speed + 15 >= 130) {
				System.out.println("삼륜은 속력 130이상 불가능합니다");
				speed = 130;
			}else {
			speed += 15;
			if(gas - 20 <= 0) {
				System.out.println("연료가 없습니다 연료를 주입해주세요");
				gas = 0;
			}else gas -= 20;}
		}
	}

	@Override
	public void breakSpeed() {
		
		if(speed -10 < 0 ) {
			System.out.println("속도는 0 미만으로 내려갈 수 없습니다.");
			speed = 0;
		}else speed -= 10;
			
	}

	@Override
	public void reFuel() {
		if(gas + 30 > MAX_GAS) {
			System.out.println("연료 최대치입니다.");
			gas = MAX_GAS;
		}else gas += 30;
		
	}

	@Override
	public void showStatus() {
		System.out.println("오토바이 바퀴 갯수 : " + cycle);
		System.out.println("오토바이 주인 : " + owner);
		System.out.println("오토바이 현재 속력 : " + speed);
		System.out.println("오토바이 연료량 : " + gas);
		
	}


	
	
}
