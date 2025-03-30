package org.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.util.Scanner;


//problem : https://www.hackerrank.com/challenges/java-md5/problem
public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Use Scanner to read inputhe
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();  // Read and trim the input to avoid extra spaces

        // Compute the MD5 hash
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(input.getBytes());  // Update the MessageDigest with the bytes of the input string.

        byte[] digest = md.digest();  // Get the MD5 hash in byte array form

        // Convert the byte array to a hexadecimal string
        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hash = bigInt.toString(16);  // Convert the hash to a hexadecimal string

        // Ensure the string is 32 characters long by padding with leading zeros if necessary
        while (md5Hash.length() < 32) {
            md5Hash = "0" + md5Hash;
        }

        // Print the MD5 hash value
        System.out.println(md5Hash);
    }
}