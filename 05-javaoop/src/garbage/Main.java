package garbage;

public class Main {
	public static void main(String[] args) {
		Item it1 = new Item(1);
		Item it2 = new Item(2);
		it2 = null;
		it1 = null;
		Item it3 = new Item(3);
		System.gc();	//메모리 회수 명령
		Item it4 = new Item(4);
		it4 = null;
		Item it5 = new Item(5);
		System.gc();//스택이 힙보다 속도가 빨라서  스택의 장점을 살리고자 힙은 작동하게 해놓고 스택을 실행
		Item it6 = new Item(6);
		it3 = null;
		System.gc();
		//스레드??		=>멀티스레드 적용 
		
	}
}
