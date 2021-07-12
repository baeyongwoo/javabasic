package colloection1;

import java.util.ArrayList;
import java.util.List;

public class Lotto2 {
	public static void main(String[] args) {
		//List 역시 참조형변수이기 때문에 주소값끼리 비교
		//따라서 단순 ==비교가 아닌 리스트1.equals(리스트2)
		//를 이용해 주소값이 아닌 주소값으로 이동했을떄 나온 실제 자료 비교를 해줘야 가능
		//equals는 내부 요소의 순서까지 고려해서 true /false를 판단
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
	}
}
