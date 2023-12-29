package org.java;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

//        problem url:https://www.hackerrank.com/challenges/java-string-reverse/problem
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        StringBuilder output = new StringBuilder(A).reverse();

        if(output.toString().equals(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
