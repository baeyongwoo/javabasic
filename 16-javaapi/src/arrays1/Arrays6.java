package arrays1;

import java.util.Arrays;

public class Arrays6 {
	public static void main(String[] args) {
		//한글은 유니코드 체계를 따라서 값이 배정되어있음
		//유니코드는 아스키코드의 범위(대략 세자리수)를 넘어서는 범위의
		//문자를 표현하기 위해 나온 체계
		String[] arr = {"홍길동", "김수한무", "거북이와 두루미", "박스프링", "제와이피", "제이에스피", "스프링부트"
				, "톰캣", "아파치", "이클립스", "인텔리제이", "java", "python", "jsp", "Spring"
		};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
