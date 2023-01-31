package com.dong.flow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m<45) {
			h = h-1;
			if(h<0) h =23;
			m = 60 - (45-m);
			
		}else {
			m = m-45;
		}
		System.out.print(h + " " + m);
		scan.close();
	}
}
