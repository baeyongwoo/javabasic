package gbbgame;

class match {
	static int GN, win, draw, lose;	//GN : Game Number 게임판수 

	static void MatchGame(String ip, String com){
		GN++;
		while(true) {
			if(ip.equals(com)) {
				System.out.println("비겻습니다.");
				draw++;
				break;
			}else if (ip.equals("가위") &&com.equals("보") || ip.equals("바위") && com.equals("가위")
					|| ip.equals("보") && com.equals("바위")) {
				System.out.println("유저가 이겼습니다.!!!!!!!!!!!!!!!!!!!!!");
				win++;
				break;
			}else if(ip.equals("가위") && com.equals("바위") || ip.equals("바위") && com.equals("보") 
					|| ip.equals("보") && com.equals("가위")){
				System.out.println("컴퓨터가 이겼습니다.ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
				lose++;
				break;
			} else {
				System.out.println("#주의 : 문자 가위 바위 보만 입력해주세요!!!!!");
				GN--;
				break;
			}

		}
	}


}