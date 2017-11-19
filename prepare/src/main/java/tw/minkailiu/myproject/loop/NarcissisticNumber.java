package tw.minkailiu.myproject.loop;

import java.util.Scanner;

public class NarcissisticNumber {

	public static void main(String[] args) {
		int getNumber = 0;
		int h = 0, t = 0, o = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a Rumber(Range 0~999)");
		getNumber = sc.nextInt();
		System.out.println("0 ~ " + getNumber + " 間的水仙花數有：");
		for (int i = 0; i <= getNumber; i++) {
			h = i / 100;
			t = i % 100 / 10;
			o = i % 100 % 10;
			int temp = (h * h * h + t * t * t + o * o * o);
			if (temp == i) {
				System.out.print( i + " , ");
			}
		}
		System.out.print("\n finished");
		sc.close();
	}

}
