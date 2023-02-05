package com.dong.loop;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int result = 0;
		
		for(int i=1; i<=a;i++) {
			result += i;
		}
		System.out.println(result);
		
		scan.close();
	}
}
