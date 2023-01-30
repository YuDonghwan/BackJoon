package com.dong.flow;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int A = scan.nextInt();
		
		//1.
		if(A % 4 ==0 && A % 100 != 0) {
			System.out.println(1);
		} else if(A % 4 ==0 && A % 100 == 0) {
			if(A%400 != 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} else {System.out.println(0);
		}
		
		//2.
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
		}
		}
		
		scan.close();
		int s = A % 4 != 0? 0 : (A%100 ==0)? 0 : (A%400 == 0) ? 1 : 0;     
}
}
