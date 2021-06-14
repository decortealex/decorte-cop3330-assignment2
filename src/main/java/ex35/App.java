/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lottery newLottery = new Lottery();
        String contestant;
        int i;

        do {
            System.out.print("Enter a name: ");
            contestant = in.nextLine();
            newLottery.addContestant(contestant);
        } while (contestant != "");

        System.out.println("The winner is... " + newLottery.selectWinner());
    }
}

class Lottery {
    private ArrayList<String> contestants = new ArrayList<String>();

    public void addContestant(String name) {
        contestants.add(name);
    }

    public String selectWinner() {
        return contestants.get((int)(Math.random() * contestants.size()));
    }
}