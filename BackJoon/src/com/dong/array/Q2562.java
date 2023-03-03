package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		for(int i : arr) {
			if(i > max) max = i;
		}
		
		int count = 0;
		for(int i : arr) {
			count++;
			if(max == i) {
				System.out.println(i);
				System.out.println(count);
			
			}
		}
		
		
		
	}

}
