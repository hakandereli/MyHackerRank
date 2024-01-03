package org.java;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

//    problem url : https://www.hackerrank.com/challenges/java-anagrams/problem

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean f = false;
        char[] c = a.toCharArray();
        Arrays.sort(c);
        char[] d = b.toCharArray();
        Arrays.sort(d);
        String x = new String(c);
        String y = new String(d);
        if (x.equals(y)) {
            f = true;
        }
        return f;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
