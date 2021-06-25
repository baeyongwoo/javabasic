package gbbgame;

import java.util.Scanner;

class User{
	static String usershow() {
		Scanner scan = new Scanner(System.in);
		String ip = scan.next();	//ip == input
		return ip;
	}
}