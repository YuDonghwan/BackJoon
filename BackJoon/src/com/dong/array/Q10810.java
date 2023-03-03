package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10810 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			for(int j=start-1; j<=end-1; j++) {
				arr[j] = ball;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
