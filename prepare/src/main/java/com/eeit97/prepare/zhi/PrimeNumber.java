package com.eeit97.prepare.zhi;

public class PrimeNumber {

	// 列出質數
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			boolean x = true;
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0) {
					x = false;
				}
			}
			if (x) {
				System.out.println(i + "是質數");
			}
		}

	}

}
