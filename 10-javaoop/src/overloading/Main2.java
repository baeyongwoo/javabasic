package overloading;

public class Main2 {

	public static void main(String[] args) {
		OverTest ot1 = new OverTest();
		ot1.showData();
		OverTest ot2 = new OverTest("10");
		ot2.showData();
		OverTest ot3 = new OverTest(10);
		ot3.showData();
		OverTest ot4 = new OverTest("6", 4);
		ot4.showData();
	}
}
