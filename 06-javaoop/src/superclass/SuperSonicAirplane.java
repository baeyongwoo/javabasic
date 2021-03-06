package superclass;

//초음속 비행기는 비행기를 상속
public class SuperSonicAirplane extends Airplane{
	//초음속 비행기도 일반 비행기처럼 속도를 사용
	//따라서 변수는 추가로 정의x

	public SuperSonicAirplane(int s) {
		//Airplane의 생성자는 상속되지 않는다
		//따라서 부모쪽의 생성자라는 의미로
		//super();를 사용하며 이 때 부모쪽에 넘겨줄 수치값도 
		//함께 받아서 처리
		super(s);
	}

	public void fly() {
		//일반 비행(부모클래스의 fly)는 super.fly();
		//를 이용해서 호출 가능
		// 속도 900이하인 경우 일반 비행모드를 호출하게 하고
		//속도 900이상 1300이하인 경우는 초음속 비행을 호출
//				if(speed + speedup >= 900 && speed + speedup<=1300) {
//					speed = 1300;
//					System.out.println("a초음속 비행 속도 : " + speed + "Km/h");
//				}else if(speed - speeddown >= 900) {
//					speed -=speeddown;
//					System.out.println("b초음속 비행속도 : " + speed + "Km/h");
//				}
//				else {
//					super.fly();
//				}
		if(speed + 500 <= 900) {
			super.fly();
		}else {
			if(speed + 500 >=1300) {
				speed = 1300;
			}else {
				speed += 500;
			}
			System.out.println("초음속 비행속도 " + speed + "k/h");
		}



	}
}
