package com.dong.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine().trim();
        int n = Integer.parseInt(br.readLine().trim())-1;

        System.out.println(tmp.charAt(n));
    }
}
