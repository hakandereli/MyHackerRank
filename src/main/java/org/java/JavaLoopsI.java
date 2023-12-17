package org.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaLoopsI {

    //Problem URL : https://www.hackerrank.com/challenges/java-loops-i/problem

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N < 2 || N > 20)
            throw new Exception("Girilen Sayı 2-20 kapalı aralığında olmalıdır.");

        for (int i = 1; i <= 10 ; i++){
            System.out.println(N +" x " + i + " = " + N*i);
        }

        bufferedReader.close();
    }


}
