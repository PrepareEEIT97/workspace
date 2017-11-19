package tw.minkailiu.myproject.loop;
import java.util.Scanner;

public class N_And_NaddOne {
	/*
	 * 輸入整數數字，計算出n/n+1總和
	 * 
	 */
	public static void main(String[] args) {
		int n=0;
		float sum =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number of n");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			sum += (i/(i+1f));
		}
		System.out.printf("The sum is %4.2f ",sum);
		
		sc.close();
	}
}
