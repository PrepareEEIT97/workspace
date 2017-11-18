package tw.minkailiu.myproject.loop;

/*
 * 輸入數字 N 印出 N 層右方的圖形	123454321 
 * 							 1234321
 * 							  12321
 * 							   121
 * 							    1
 */

import java.util.Scanner;

public class NumberPicEx2 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number of N:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int k = i; k > 0; k--) {			//宣告一個變數K ，讓他取得當前i的層數，第一層i=0則K只需要補0個空格，第二層i=1，則需要補1個空格
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i); j++) {		//宣告一個變數j ，讓他取得輸入N的層數，因為第一層需要由1遞增至N - i，因此顯示J+1直至N - i 為止
				System.out.print(j + 1);			
				if (j == (n - (i+ 1))) {			//n-(i+1) = 總層數 - 現在層數(因為i從0開始，因此為i+1)， 
					for (int b = j; b > 0; b--) {	//宣告變數B，從J開始遞減，因為H為最中心的數字，也就是從最大的數字開始遞減1，至1為止
						System.out.print(b);
					}
				}
			}
			System.out.println();					//換行
		}

		sc.close();
	}

}
