package stringbuilder1;

public class Builder6 {

	public static void main(String[] args) {
		//setCharAt()은 문자열에서 입력한 인덱스번호의 문자를
		//다른 문자로 교체
		//insert()는 뒤로 밀어내 공간을 확보하지만 setCharAt()은 
		//그냥 그 위치의 문자를 덮어씌워버림
		//setCharAt()도 역시 한번에 한 글자에 대해서만 교체가 가능
		StringBuilder str = new StringBuilder("abcdefg");
		//setCharAt()으로 변경하는 단일 문자는 홀따옴표 ''로 여닫는 부분을 작성
		str.setCharAt(5, 'z');
		System.out.println(str);
	}

}
