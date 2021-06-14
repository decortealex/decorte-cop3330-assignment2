/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex26;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rate, bal, payment;
        double numMonths;

        System.out.print("What is your balance? ");
        bal = Double.parseDouble(in.nextLine());
        System.out.print("What is the APR on the card (as a percent)? ");
        rate = Double.parseDouble(in.nextLine());
        System.out.print("What is the monthly payment you can make? ");
        payment = Double.parseDouble(in.nextLine());

        PaymentCalculator cc = new PaymentCalculator(rate, bal, payment);
        numMonths = cc.calculateMonthsUntilPaidOff();

        System.out.printf("It will take you %.1f months to pay off this card.", numMonths);
    }
}

class PaymentCalculator {
    private double dailyRate, bal, monthlyPayment;
    private double numMonths;

    public PaymentCalculator(double APR, double bal, double monthlyPayment) {
        this.dailyRate = (APR / 100) / 365;
        this.bal = bal;
        this.monthlyPayment = monthlyPayment;
    }
    double calculateMonthsUntilPaidOff() {
        numMonths = (-(1/30) * Math.log10(1 + (bal/monthlyPayment) * (1 - Math.pow((1 + dailyRate), 30)))) / Math.log10(1 + dailyRate);
        return numMonths;
    }
}
