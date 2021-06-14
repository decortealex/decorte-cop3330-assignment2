/*
 * UCF COP3330 Summer 2021 Assignment 2 Solution
 * Copyright 2021 Alexander De Corte
 */
package ex25;

import java.util.Scanner;

public class App {
    public static int passwordValidator(String pass) {
        int i, len = pass.length();
        char[] pw = pass.toCharArray();
        if(len < 8) {
            for (i = 0; i < pw.length; i++) {
                if(Character.isDigit(pw[i])) {
                    return 0; // very weak password (numbers only && len < 8)
                } else {
                    return 1; // weak password (letters only && len < 8)
                }
            }
        } else {
            for(i = 0; i < pw.length; i++) {
                if(!(pw[i] >= '0' && pw[i] <= '9') &&
                        !(pw[i] >= 'A' && pw[i] <= 'Z') &&
                        !(pw[i] >= 'a' && pw[i] <= 'z'))
                {
                    return 3; // very strong password (letters && numbers && special chars && len > 8)
                } else {
                    return 2; // strong password (letters && 1 or more numbers && len > 8)
                }
            }
        }
        return -1; // password does not meet any of the above criteria ( probably just default to really weak?)
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pass;
        int result;

        System.out.print("Enter the password you would like to test: ");
        pass = in.nextLine();
        result = passwordValidator(pass);
        switch (result) {
            case -1 -> System.out.printf("The password '%s' does not meet any of the above criteria.\n", pass);
            case 0 -> System.out.printf("The password '%s' is a very weak password\n", pass);
            case 1 -> System.out.printf("The password '%s' is a weak password\n", pass);
            case 2 -> System.out.printf("The password '%s' is a strong password\n", pass);
            case 3 -> System.out.printf("The password '%s' is a very strong password\n", pass);
        }
    }
}
