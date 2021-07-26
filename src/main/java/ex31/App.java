/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex31;

import java.util.Scanner;
public class App {
    public static int calcKarvonenHR(int age, int restingHR, int intensity) {
        double intensityDec = (double)intensity / 100;
        return (int)((((220 - age) - restingHR) * intensityDec
        ) + restingHR);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0, restingHR = 0, karvonenHR, intensity;
        boolean isValid = false;

        while(!isValid) {
            try {
                System.out.print("What is your resting heart rate? ");
                restingHR = Integer.parseInt(in.nextLine());
                System.out.print("What is your age? ");
                age = Integer.parseInt(in.nextLine());
                isValid = true;
            } catch(NumberFormatException nfe) {
                System.out.println("That is not a valid input");
            }
        }

        System.out.printf("Resting pulse: %-10d Age: %3d\n", restingHR, age);
        System.out.printf("%-13s| %-5s", "Intensity", "Rate\n");
        System.out.printf("-------------|--------\n");
        for(intensity = 55; intensity <= 95; intensity += 5) {
            karvonenHR = calcKarvonenHR(age, restingHR, intensity);
            System.out.printf("%-2d%%          | %-3d bpm\n", intensity, karvonenHR);
        }
    }
}
