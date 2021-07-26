/*
 * UCF CUP 3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int i, reps;
        double buf = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers would you like to add? ");
        reps = Integer.parseInt(in.nextLine());

        for(i = 0; i < reps; i++) {
            System.out.print("Enter a number: ");
            try {
                buf += Double.parseDouble(in.nextLine());
            } catch(NumberFormatException ignored) {
            }
        }

        System.out.printf("The total is %.1f\n", buf);
    }
}
