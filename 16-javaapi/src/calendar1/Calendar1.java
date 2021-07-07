package calendar1;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		//Caledar는 현재 시간을 일반 시간이 아닌 요일이나 오전/오후 등으로
		//달력을 기준을 표기해주는 방식
		//Calendar.getInstance()를 이용해 사용
		Calendar now = Calendar.getInstance();
		
		System.out.println("년도 :" + now.get(Calendar.YEAR));
		//월은 0이 1월, 11이 12월이므로 1을 반드시 더함
		System.out.println("월 :" + (now.get(Calendar.MONTH) + 1));
		System.out.println("일 :" + now.get(Calendar.DAY_OF_MONTH));
		//1 - 일요일 
		System.out.println("요일 :" + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전오후 :" + now.get(Calendar.AM_PM));
		System.out.println("시 :" + now.get(Calendar.HOUR));
		System.out.println("분 :" + now.get(Calendar.MINUTE));
		System.out.println("초 :" + now.get(Calendar.SECOND));
		
	}

}
