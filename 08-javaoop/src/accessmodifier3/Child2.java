package accessmodifier3;

import accessmodifier2.Parent;

//Child2 는 accessmodifier3 패키지 소속
//Parent는 accessmodifier2 패키지 소속
// 부모 자식간 클래스 소속이 다르다 
public class Child2  extends Parent{
	protected int e;
	
	public int getB() {
		return b;
	}
	//b변수의 값을 변경할 수 있도록 도와주는 
	//setB(int b) 메서드
	//b값은 음수 될수 없다
	public void SetB(int b) {
		if(b >= 0) {
			this.b = b;
		}else {
			System.out.println("음수는 불가능");
		}
	}
}
