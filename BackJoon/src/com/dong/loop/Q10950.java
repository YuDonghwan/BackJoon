package com.dong.loop;

import java.util.Scanner;

public class Q10950 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x + y);
			
		}
		
		scan.close();
	}
	
}
