package tw.minkailiu.myproject.loop;

/*
 * 一顆球由高度 H 掉落，每次反彈為高度的一半，求反彈  N 次之後，
 * 共經過多少米，及第N次反彈多高
 * 
 */

import java.util.Scanner;

public class BallBounceSum {

	public static void main(String[] args) {
		int count;
		float high, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Ball's height (m)");
		high = sc.nextFloat();
		System.out.println("Please enter how much Ball will bounce times");
		count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			sum += high;
			high = high / 2;
			sum += high;
		}
		System.out.println("Bounce " + count + " times , The ball will move " + sum + "m , Last bounce will to " + high + "m");
		sc.close();
	}

}
