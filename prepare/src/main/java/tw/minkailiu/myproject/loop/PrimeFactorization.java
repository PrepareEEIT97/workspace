package tw.minkailiu.myproject.loop;

import java.util.Scanner;

public class PrimeFactorization {
	/*
	 * 
	 * 對一個數字進行質因數分解，並列出有哪些質因數
	 * 
	 */
	public static void main(String[] args) {
		int Number = 0;
		int start = 2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a Number");
		Number = sc.nextInt();
		System.out.print("Divisor = ");
		while (start <= Number) {
			if (start == Number) {
				System.out.println(Number);
				break;
			}else if(Number % start ==0){
				System.out.print(start + " * ");
				Number = Number / start;
			}else{
				start++;
			}
		}
		sc.close();
	}
}
