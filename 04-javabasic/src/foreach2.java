class avg{
	double avg;
	int sum;
	public double avgCal(int score[]) {
		sum = 0;
		for(int i : score) {
			sum += i;
		}
		avg = sum / score.length;
		
		return avg;
//		for(int i = 0; i < score.length; i++) {
//			sum +=score[i];
//			avg = sum/score.length;
//		}
//		sum = 0;
//		return  avg; 
		
	}
	
}

public class foreach2 {
	public static void main(String[] args) {
		//다음은 학생드르이 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		//위 3개의 명칭으로 arry를 만들어 담아준다음
		//과목별 평균 점수를 foreach로 구현
		
		int math [] = {96, 23, 52, 82, 72, 31, 58};
		int eng [] = {62, 42, 68, 31, 80, 77, 45};
		int com [] = {10, 28, 39, 74, 65, 90, 98};
		int sum = 0;
		
		avg avg = new avg();
		
		System.out.println("수학평균 : " + avg.avgCal(math));
		System.out.println("영어평균 : " + avg.avgCal(eng));
		System.out.println("컴퓨터평균 : " + avg.avgCal(com));
		
	}
}
