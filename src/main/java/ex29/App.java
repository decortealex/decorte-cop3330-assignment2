/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex29;

import java.util.Scanner;

public class App {
    public static int calcYearsTillDouble(double rate) {
        return (int)Math.ceil(72 / rate);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rate = 0;
        int years;
        boolean isValid = false;

        while(!isValid) {
            System.out.print("What is the rate of return? ");
            try {
                rate = Double.parseDouble(in.nextLine());
                if(rate == 0) {
                    throw new ArithmeticException();
                } else {
                    isValid = true;
                }

            } catch(NumberFormatException nfe) {
                System.out.println("Sorry. that's not a valid input");
            } catch(ArithmeticException ae) {
                System.out.println("Sorry. The rate of return must be greater than 0.");
            }
        }

        years = calcYearsTillDouble(rate);
        System.out.printf("It will take %d years to double your initial investment.", years);
    }
}
