package gbbgame;

import java.util.Deque;

public class Main {

	public static void main(String[] args) {
	
		while(true) {			
		System.out.print("가위 바위 보! >> (종료는 q입니다.)");
		String ip = User.usershow();
		String com = Com.show();
		//if(ip.equals("q") || ip.equals("Q") || ip.equals("ㅂ"))
		if(ip.toUpperCase().equals("Q") || ip.equals("ㅂ"))
		{
			break;
		}
		
		System.out.printf("사용자 : " + ip + "\t컴퓨터 " + com);
		System.out.println();
		
		match match = new match();
		match.MatchGame(ip, com);
		
		
		}
		System.out.println("================전적=======================");
		System.out.println(match.GN + "전 " + match.win +"승 " + match.draw + "무 " + match.lose + "패");
	}
	

}
