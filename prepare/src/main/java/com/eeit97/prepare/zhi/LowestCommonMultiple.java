package com.eeit97.prepare.zhi;

public class LowestCommonMultiple {
	//最小公倍數
	public static void main(String[] args) {
		int a=72;
		int b=144;
		int c=48;
		
		int i = a*b*c;
		int lcm = a*b*c;
		while(i>=a&&i>=b&&i>=c){
			if(i%a==0&&i%b==0&&i%c==0){
				lcm=i;
			}
			i--;
		}
		System.out.println(a+","+b+","+c+"的最小公倍數為："+lcm);
	}

}
