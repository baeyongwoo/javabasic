package String1;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		//Scanner를 통해 전체 문장을 입력
		//다음으로 문장내 찾고 싶은 단어 입력;
		//문장내에 있는 단어들의 인덱스번호와 몇개가 검출된지

		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("전체 문장을 입력해주세요.");
		String all = scan.nextLine();

		System.out.println("문장 내에서 카운트할 단어를 입력");
		String voca = scan.nextLine();
		
 		int fidx = -1;
		boolean bool = true;
		while(bool) {
			int get = all.indexOf(voca, fidx + 1);
			if(get == -1) {
				bool = false;
			}else {
				fidx = get;
				count++;
				System.out.println(get + "번에서" + count + "번째" + voca + "검출");
			}

		}
		System.out.println("총 " + voca + "는 " + count + "번 검출되었습니다.");
		
	}

}

//System.out.println(index);
//if(all.length()-1 <= index) {
//	count++;
//	System.out.println(index + "번에서" + count + "번째" + voca + " 검출완료");
//	index++;
//} 

