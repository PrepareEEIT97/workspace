package tw.minkailiu.myproject.loop;

public class TestLoopToPrintTriangle {

	public void showTriangle1() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 11 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			if(i==1){
				System.out.println();
				continue;
			}
			for (int j = 0; j < i-1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < 11 - i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TestLoopToPrintTriangle test = new TestLoopToPrintTriangle();
		test.showTriangle1();

	}

}
