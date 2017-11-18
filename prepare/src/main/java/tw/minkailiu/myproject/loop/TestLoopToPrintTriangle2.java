package tw.minkailiu.myproject.loop;

public class TestLoopToPrintTriangle2 {

	public void ShowTriangle() {
		int n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i + j < n) {
					System.out.print(" ");
				} else if (i + j > n - i) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TestLoopToPrintTriangle2 test = new TestLoopToPrintTriangle2();
		test.ShowTriangle();

	}
}
