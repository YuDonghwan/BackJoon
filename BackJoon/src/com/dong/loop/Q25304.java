package com.dong.loop;

import java.util.Scanner;

public class Q25304 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int totalPrice = scan.nextInt();
		int totalCnt = scan.nextInt();
		int tmp = 0;
		
		int price = 0;
		int cnt = 0;
		for(int i=0; i<totalCnt; i++) {
			price = scan.nextInt();
			cnt = scan.nextInt();
			
			tmp += price * cnt;
		}
		
		if(totalPrice == tmp) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}

}
