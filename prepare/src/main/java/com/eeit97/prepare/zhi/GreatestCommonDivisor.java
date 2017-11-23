package com.eeit97.prepare.zhi;

public class GreatestCommonDivisor {
	//求最大公因數
	public static void main(String[] args) {
		int a = 96;
		int b = 3072;
		int c = 1536;
		int i = 1;
		int gcd = 0;
		while(i<=a&&i<=b&&i<=c){
			if(a%i==0&&b%i==0&&c%i==0){
				gcd=i;
			}
			i++;
		}
		System.out.println(a+","+b+","+c+"的最大公因數為："+gcd);
	}

}
