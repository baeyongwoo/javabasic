package interface1;

public class Main2 {

	public static void main(String[] args) {
		Vehicle ab = new Auto_bicycle("나는 이륜", 2);
		ab.showStatus();
		ab.Accel();
		ab.Accel();
		ab.showStatus();
		ab.breakSpeed();
		ab.breakSpeed();
		ab.breakSpeed();
		ab.showStatus();
		
		System.out.println("=========================");
		Vehicle ab2 = new Auto_bicycle("나는 삼륜", 3);
		ab2.showStatus();
		ab2.Accel();
		ab2.Accel();
		ab2.Accel();
		ab2.showStatus();
		ab2.Accel();
		ab2.Accel();
		ab2.Accel();

	}

}
