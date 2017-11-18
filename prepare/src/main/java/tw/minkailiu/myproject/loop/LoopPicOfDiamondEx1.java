package tw.minkailiu.myproject.loop;

/*			輸入 N 顯示  N * 2 層的菱形
 * 		        *
 * 			  *   *
 * 			*       *
 * 			  *   * 	
 * 				*
 */

import java.util.Scanner;

public class LoopPicOfDiamondEx1 {

	public static void main(String[] args) {
		int n = 0, k = 0;

		System.out.println("Please enter a Number of N:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < (n * 2) + 1; i++) {
			if (i <= n) {
				for (int j = (n - i); j > 0; j--) {			//達到N層前的左方空白，增加(總層數 - 當前曾數)x2的空白鍵 
					System.out.print("  ");
				}
				System.out.print("*");						//印出第一個 *
				if (i != 0) {
					for (k = 0; k < (i * 2) - 1; k++) {		//只要不是第1層，就在第一個*後面接著印出 ( 當前層數x2 ) 的空白鍵
						System.out.print("  ");				
					}
					System.out.print(" *");					//印出一個空白鍵 + * ，讓其圖形對稱
				}
			} else if (i > n) {
				for (int j = 0; j < (i - n); j++) {			//在超過N層之後，每超過一層就在左方印 2個空白 (當前層數 - 指定層數) x2個空白，當作下半部分的左方空白
					System.out.print("  ");
				}
				System.out.print("*");						//印出第一個*
				if (i != (n * 2)) {
					for (int l = ((((n * 2) - i) * 2) - 1); l > 0; l--) {		//從n層開始，中間空格的規律將變為(2n-i)x2-1，因此for迴圈則由(2n-i)x2-1開始遞減
						System.out.print("  ");
					}
					System.out.print(" *");										//印出一個空白鍵 + * ，讓其圖形對稱
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
