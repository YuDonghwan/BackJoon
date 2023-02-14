package com.dong.loop;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		
	}
}
