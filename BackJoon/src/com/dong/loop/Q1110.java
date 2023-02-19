package com.dong.loop;

import java.util.Scanner;

public class Q1110 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int copy = n;
		int cnt = 0;
		
		while(true) {
			
			n = ((n%10) * 10) + (((n/10) + (n%10))%10); 
			cnt++;
			
			
			if(copy == n) break;
		}
		System.out.println(cnt);
		scan.close();		
	}

}
