package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int start = 0;
        int end = 0;

        int[] arr = new int[m];
        int tmp = 0;
        for(int i=0; i<m; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            start = Integer.parseInt(st.nextToken()) -1;
            end = Integer.parseInt(st.nextToken()) -1;

            for(; start < end; start++,end--) {
                tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
            for(int result : arr) {
                System.out.print(result + " ");
            }
    }
}
