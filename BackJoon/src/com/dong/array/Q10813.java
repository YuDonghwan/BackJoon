package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10813 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int a = 0;
		int b = 0;
		int tmp = 0;
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
	
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken()) -1;
			b = Integer.parseInt(st.nextToken()) -1;
			
			tmp = arr[a];
			arr[a] = arr[b];
			arr[b] = tmp;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
}
