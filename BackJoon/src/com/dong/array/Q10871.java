package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		String str1 = br.readLine();
		st = new StringTokenizer(str1, " ");
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		String str2 = br.readLine();
		st = new StringTokenizer(str2, " ");
		int[] arr = new int[n];
		
		
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i : arr) {
			
			if(i < a) {
				sb.append(String.format("%d ", i));
			}
			
		}
		
		System.out.println(sb);
	}

}
