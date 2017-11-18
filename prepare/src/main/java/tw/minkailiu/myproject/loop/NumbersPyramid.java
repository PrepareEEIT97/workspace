package tw.minkailiu.myproject.loop;

/*
 * 輸入整數 N，將顯示N層的數字金字塔，
 * 最中間最高的數字為1，兩側為2，再旁邊為3，依此類推
 * 
 * 
 */

import java.util.Scanner;

public class NumbersPyramid {

	public static void main(String[] args) {
		//宣告變數n為使用者輸入層數時的數字
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		//接受使用者輸入的層數
		System.out.println("Please enter a Number of N:");
		n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {				//利用一開始輸入的n 來判左上方會需要多少空格 ，因為一共要顯示n格，而i的數字 = 每一層要往左縮小的空格數，因此j--縮排
				System.out.print(" ");
			}
			for (int l = i; l >= 1; l--) {				//利用 l 得到i的數字，代表往中間倒數時最左側的最大數字，往內顯示時每多顯示一格l便-1，所以是l--
				System.out.print(l);
				if (l == 1) {							//當 l 往內縮減至中心顯示為1的時候
					for (int a = 2; a <= i; a++) {		//再由a形成迴圈，往右邊顯示至i的大小 (i代表現在為第幾層)，因此第二層i = 2 ，則a顯示至2
						System.out.print(a);
					}
				}
			}
			System.out.println();						//結束一層迴圈之後換行，並繼續執行下一層的迴圈
		}
		sc.close();
	}
}
