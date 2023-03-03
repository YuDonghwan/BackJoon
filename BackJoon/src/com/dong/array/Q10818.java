package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Q10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		/*
		 * IntStream stream = Arrays.stream(arr);
		 * System.out.println(stream.min().getAsInt()); stream = Arrays.stream(arr);
		 * System.out.print(stream.max().getAsInt() + " ");
		 */
		int max = -1000000;
		int min = 1000000;
		
		for(int i : arr) {
			if ( i < min) min = i;
			if ( i > max) max = i;
		}
		
		System.out.print(min + " " + max);
		
	}
}
