package io1;

import java.io.FileWriter;
import java.io.IOException;

public class FileIO1 {
	public static void main(String[] args) throws IOException {
		//외부에 텍스트파일을 만들기 위해서 FileOutputStream을 사용
		//변수를 만들고 거기에 파일 경로를 적기
		//main메서드에반드시 throws IOException을 작성
		//FileOutputStream output = new FileOutputStream("c:/io/test.txt");
		
		//간편한 사용을 위해 FileOutputStream자료형 대신
		//FileWriter 자료형 사용
		FileWriter output = new FileWriter("c:/io/test.txt");
		
		//.write("내용")을 이용해 메모장 내부에 필기 가능
		// 단, 줄바꿈이 자동으로 안 되기 때문에 줄 개행 필요한 부분에 해주기
		output.write("나는야 자바 개발자\n");
		output.write("다음 공부할 것은 jsp\n");
		output.write("그 다음 공부할 것은 spring\n");
		
	}
}
