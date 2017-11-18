package tw.minkailiu.myproject.loop;

/*
 * 輸入數字 N 印出 N 層右方的圖形	12345 
 * 							 1234
 * 							  123
 * 							   12
 * 							    1
 */

import java.util.Scanner;
public class NumberPicEx1 {

	public static void main(String[] args) {
		int n =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number of N:");
		n = sc.nextInt();
		
		for(int i =0; i<n;i++){
			for(int k =i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=1;j<(n-i+1);j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
