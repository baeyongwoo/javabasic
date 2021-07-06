package stringbuilder1;

public class Builder1 {
	public static void main(String[] args) {
		//StringBuilder는 String 클래스와의 로직차이로 인해
		//속도 개선이 되었음. 일부 기능은 String의 기능과 겹침
		//자주자주 바꿔야할 때 사용
		StringBuilder a = new StringBuilder("abefg");
		
		//2번 이후의 모든 자료를 다 1칸씩 뒤로 밀고 확보된 공간에 "cd"를 입력
		a.insert(2, "cd");
		
		System.out.println(a);
	}
}
