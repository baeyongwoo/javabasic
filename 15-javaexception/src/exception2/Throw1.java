package exception2;

public class Throw1 {

	public static void main(String[] args) {
		int i = (int)(Math.random() * 10);
		//throw는 강제 예외 발생, 테스트 용도
		try {
			if(i > 3) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("정상 범위 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없는 예외를 만들었습니다.");
			e.printStackTrace();
		}
		finally {
			System.out.println("코드는 여기서 멈춥니다.");
		}
	}

}
