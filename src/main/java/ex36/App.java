/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Statistics calculator = new Statistics();
        Scanner in = new Scanner(System.in);
        String data = "";
        double avg, min, max, std;

        do {
            System.out.print("Enter a number: ");
            data = in.nextLine();
            try {
                calculator.addData(Double.parseDouble(data));
            } catch(NumberFormatException ignored) {}

        } while(!(data.equalsIgnoreCase("done")));

        avg = calculator.average();
        min = calculator.min();
        max = calculator.max();
        std = calculator.std();

        calculator.printData();
        System.out.printf("The average is %.1f\n", avg);
        System.out.printf("The minimum is %.0f\n", min);
        System.out.printf("The maximum is %.0f\n", max);
        System.out.printf("The standard deviation is %.2f\n", std);

    }
}

class Statistics {
    private ArrayList<Double> data = new ArrayList<Double>();

    public void addData(double pt) {
        data.add(pt);
    }

    public void sortData() {
        Collections.sort(data);
    }

    public double average() {
        double sum = 0;
        for (Double pt : data) {
            sum += pt;
        }

        return (sum / data.size());
    }

    public double max() {
        sortData();
        return data.get(data.size() - 1);
    }

    public double min() {
        sortData();
        return data.get(0);
    }

    public double std() {
        double mean = average(), sum = 0;
        for (Double pt : data) {
            sum += Math.pow((pt - mean), 2);
        }
        return Math.sqrt(sum / data.size());
    }

    public void printData() {
        System.out.print("Numbers: ");
        for (Double pt : data) {
            System.out.printf("%.0f  ", pt);
        }
        System.out.println();
    }
}
