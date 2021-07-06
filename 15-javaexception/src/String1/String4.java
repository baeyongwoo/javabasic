package String1;

public class String4 {

	public static void main(String[] args) {
		//length()는 문자열의 길이를 알 수 있습니다.
		//정수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사릴아ㅓ랑마ㅓ";
		System.out.println(name.length());
		
		//replace는 찾아 바꾸기입니다.
		//.replace("찾을단어", "바꿀단어"); 순
		String report = "안녕하세요 리포트 보고자는 김영수, 김영수입니다.";
		report = report.replace("김영수", "체르타");
		System.out.println(report);
	}
}
