package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = 0;
        int[] arr = new int[10];
        int cnt = 0;
        for(int i=0; i<10; i++) {
            n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
        }

        for(int i=0; i < arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) arr[i] = -1;
            }
        }
        for(int a : arr) {
            if(a != -1) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
