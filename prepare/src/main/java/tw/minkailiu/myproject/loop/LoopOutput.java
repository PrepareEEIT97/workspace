package tw.minkailiu.myproject.loop;

import java.util.Scanner;

public class LoopOutput {
	/*
	 * 輸入兩個數字，一個代表起始，一個代表結束 之後畫面將會輸出start -> End 中所有的數字 並以7個數字分行顯示
	 */
	public static void main(String[] args) {
		int start, end, count = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a Start Number");
		start = sc.nextInt();
		System.out.println("Please Enter a End Number");
		end = sc.nextInt();
		
		if(start == end){
			System.out.println("No result");
		}else{
			for (; start <= end; start++) {
				System.out.print(start+"\t");
				if(count ==7){
					System.out.println();
					count =0;
				}
				count +=1;
			}
		}
		sc.close();
	}
}
