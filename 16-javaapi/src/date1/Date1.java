package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		//Date는 날짜를 표현하는 클래스로 DB등과 통신할 때 Date를 이용해
		//날짜자료를 받아오거나 넘겨주는 것 권장
		//사용시 import java.util.Date를 해야함
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
		//표현되는 양식을 바꿀떄 SimpleDateFormat을 활용
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		
	}

}
