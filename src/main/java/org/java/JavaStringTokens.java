package org.java;

import java.util.Scanner;

//problem: https://www.hackerrank.com/challenges/java-string-tokens/problem
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        String[] tokens = s.split("[^A-Za-z]+");


        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }


        System.out.println(count);

        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}
