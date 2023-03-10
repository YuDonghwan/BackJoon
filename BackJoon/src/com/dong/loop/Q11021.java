package com.dong.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			
			StringTokenizer st;
			
			for(int i=1; i<=n; i++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				
				bw.write(String.format("Case #%d: %d + %d = ",i,a,b) + (a + b) + "\n");
			}
			
			
			br.close();
			
			bw.flush();
			bw.close();
		}
	
}
