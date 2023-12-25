package org.java;

import java.util.*;

public class JavaInttoString {

//    Problem url:https://www.hackerrank.com/challenges/java-int-to-string/problem

    public static void main(String[] args) {


        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            String s = String.valueOf(n);


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}
