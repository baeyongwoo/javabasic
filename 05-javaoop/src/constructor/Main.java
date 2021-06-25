package constructor;

import java.util.Scanner;

import structure.PersonClass;

public class Main {
	public static void main(String[] args) {
		//constuctor 패키지 내부에 소속된 Car을 호출할때는
		//같은 영역이기 때문에  constructor.Car로 호출해도 되고
		//그냥 Car로 호출해도 된다.
		Car car1 = new Car(100,0,"홍길동");
		//constructor.Car car2 =  new constructor.Car(100,0,"홍길동");
		
		//자동차 정보 조회
		
		car1.getInfo();
		car1.AccelSpeed();
		car1.AccelSpeed();
		car1.AccelSpeed();
		car1.breakspeed();
		
		//다른 패키지 Car호출
		//다른 패키지의 클래스를 호출할때는
		//반드시 클래스명을 앞에 붙여준다
		
		
		//같은 패키지 내부에 중복된 이름이 없는 외부클래스라고 해도
		//호출시에는 반드시 패키지명을 입력해줘야 호출됨
		PersonClass p1 = new PersonClass("홍길동", 24, "010-7111-4138", "서울", false);
		p1.Personinfo();
		Scanner scan = new Scanner(System.in);
	}
}
