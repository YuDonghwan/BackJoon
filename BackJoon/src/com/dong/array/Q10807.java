package com.dong.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q10807 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		int[] arr2 = new int[arr.length];
		int count = 0;
		arr = br.readLine().split(" ");
		
		int tmp = Integer.parseInt(br.readLine());
		for(int i=0; i< arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] == tmp) count++;
		}
		
		bw.write(String.valueOf(count));
		
		
		br.close();
		bw.flush();
		bw.close();
		
		
		
	}
	
}
