package com.dong.flow;

import java.util.Scanner;

public class Q14681 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
				
		if(x > 0) {
			if(y > 0)System.out.println(1);
			else System.out.println(4);
		} 
		if(x < 0) {
			if(y > 0)System.out.println(2);
			else System.out.println(3);
		} 
		scan.close();
				
	}
}
