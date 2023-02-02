package com.dong.flow;

import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		if(!(n1 < 1 || n1 > 6 || n2 < 1 || n2 > 6 || n3 < 1 || n3 > 6)) {
			
			int price = 0;
			int max = 0;
			if(n1 == n2 && n1 == n3) price = 10000 + (n1 * 1000);
			if(n1 == n2 && n1 != n3) price = 1000 + (n1 * 100);
			if(n1 == n3 && n2 != n3) price = 1000 + (n1 * 100);
			if(n2 == n3 && n1 != n2) price = 1000 + (n2 * 100);
			
			if(n1 != n2 && n1 != n3 && n2 != n3) {
				
				max = Math.max(n1, n2);
				max = Math.max(max, n3);
				price = max * 100;
				
			}
			System.out.println(price);
			scan.close();
		}
		}
}
