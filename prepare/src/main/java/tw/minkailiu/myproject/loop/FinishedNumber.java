package tw.minkailiu.myproject.loop;

/*
 * 
 * 列出1~1000之間的完數
 * 
 */
public class FinishedNumber {

	public static void main(String[] args) {

		System.out.print("1~1000 Finish Numbers are :");

		for (int t = 1; t < 1000; t++) {
			int sum = 0;
			for (int i = 1; i < t; i++) {
				if (t % i == 0)
					sum = sum + i;
			}
			if (sum == t) {
				System.out.print(t + " ");
			}
		}

	}

}
