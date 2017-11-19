package tw.minkailiu.myproject.loop;

import java.util.Scanner;

public class FibonacciEx1 {

	public static void main(String[] args) {
		int month1 = 0, month2 = 1, count = 0, sum = 0;
		System.out.println("請輸入要查詢第幾個月的兔子數量：");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		for (int i = 2; i <= count; i++) {
			sum = month1 + month2;
			month1 = month2;
			month2 = sum;	
		}
		if(count ==0){
			System.out.println("第 0 月共有 0 對兔子。");
		}else if(count <0){
			System.out.println("沒有負數月份。");
		}else{
			System.out.println("第 " + count + " 月共有 " + sum + " 對兔子。");
		}
		sc.close();
	}

}
