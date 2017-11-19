package tw.minkailiu.myproject.loop;

import java.util.Scanner;

public class LoopTriangleEx1 {

	/*
	 * key in any number ,program will print triangle.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any Number");
		count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			for(int a = (count-i);a>0;a--){
				System.out.print(" ");
			}
				for (int j = 0; j < i + 1; j++) {
					for(int k=count;k<j;k--){
						System.out.print(" ");
					}
					System.out.print("* ");
				}
			System.out.println("");
		}

		sc.close();
	}

}
