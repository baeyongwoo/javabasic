package constructor;

public class BasketballPlayer {

	public int ki;
	public int jump;
	public String name;
	
	public BasketballPlayer(String name, int ki, int jump) {
		//super();
		this.ki = ki;
		this.jump = jump;
		this.name = name;
		System.out.println(name + " 선수의 키 : " + ki + " 점프력 : " + jump + " 입력이 완료되었습니다.");
		
	}
//	public BasketballPlayer(String n, int k, int j) {
//		name = n;
//		ki = k;
//		jump = j;
//		System.out.println(name + " 선수의 키 : " + ki + " 점프력 : " + jump + " 입력이 완료되었습니다.");
//	}


	public void getInfo() {
		System.out.println("--------선수정보--------");
		System.out.println(name + " 선수의 키는 : " + ki + " 점프력 : " + jump);
	}
	public void dumk() {
		
		if((ki + jump) >= 300) {
			System.out.println("덩크슛에 성공했습니다.");
		}else System.out.println(300-(ki+jump) + " 차이로 골대에 닿지 않았습니다.");
	}
}
