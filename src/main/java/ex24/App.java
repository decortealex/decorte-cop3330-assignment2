/*
 * UCF COP3330 Summer 2021 Assignment 2 Solution
 * Copyright 2021 Alexander De Corte
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    // Check if two strings are anagrams of each other.
    public static boolean isAnagram(String s1, String s2) {
        int i, len1 = s1.length(), len2 = s2.length();
        char[] ar1 = new char[len1], ar2 = new char[len1];

        // if the two strings are not the same length, they cannot be anagrams.
        if(len1 != len2) {
            return false;
        } else {

            //Split the strings into character arrays
            for (i = 0; i < len1; i++) {
                ar1[i] = s1.charAt(i);
                ar2[i] = s2.charAt(i);
            }

            // Sort the strings
            Arrays.sort(ar1);
            Arrays.sort(ar2);

            // Compare sorted strings
            for (i = 0; i < ar1.length; i++) {
                if (ar1[i] != ar2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1, str2;
        boolean result;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        str1 = in.nextLine();
        System.out.print("Enter the second string: ");
        str2 = in.nextLine();

        result = isAnagram(str1, str2);

        if(result)
            System.out.printf("\"%s\" and \"%s\" are anagrams.\n", str1, str2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.\n", str1, str2);
    }
}
