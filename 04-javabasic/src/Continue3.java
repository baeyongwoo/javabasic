class avger{
	public int calculator(int [] a) {
		int count = 0;
		int sum = 0;
		for(int i : a) {
			if(i >= 60) {
				count++;
				sum += i;
			}
		}
		return sum/count;
	}
}

public class Continue3 {
	public static void main(String[] args) {
		
		int math [] = {96, 23, 52, 82, 72, 31, 58};
		int eng [] = {62, 42, 68, 31, 80, 77, 45};
		int com [] = {10, 28, 39, 74, 65, 90, 98};
		
		int count = 0;
		int sum = 0;
		avger avg = new avger();
		//avg.calculator(math);
		
		System.out.println("수학평균 : " + avg.calculator(math));
		System.out.println("영어 : " + avg.calculator(eng));
		System.out.println("컴퓨터평균 : " + avg.calculator(com));
	}
}
