package com.dong.loop;

import java.io.IOException;
import java.util.Scanner;


public class Q10952 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//				
//		while(true) {
//					
//			st = new StringTokenizer(br.readLine()," ");
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			
//			if(A==0 && B==0) {
//				break;
//			}
//			sb.append((A+B)).append('\n');
//		}
//		System.out.println(sb);
//	}
//}
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		while(true) {
			System.out.print("a: ");
			a = scan.nextInt();
			System.out.print("b: ");
			b = scan.nextInt();
			if(a == 0 &&  b == 0) {
				return ;
			}
			System.out.println(a + b);
			
			scan.close();
		}
		
	}
}
