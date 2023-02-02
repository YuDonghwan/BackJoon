package com.dong.flow;

import java.util.Scanner;

public class Q2525 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int h = scan.nextInt();
		int m = scan.nextInt();
		int c = scan.nextInt();

		m += c;
		if (m / 60 > 0) {
			h += m / 60;
			m %= 60;
			h %= 24;
		}
		System.out.println(h + " " + m);

		scan.close();
	}
}
