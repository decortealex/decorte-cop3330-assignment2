/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex33;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MagicEightBall eightBall = new MagicEightBall();
        Scanner in = new Scanner(System.in);
        boolean hasQuit = false;

        while(!hasQuit) {
            System.out.println("What's your question? ");
            in.nextLine();
            System.out.println(eightBall.genAnswer());

            System.out.print("would you like to ask another question (Y/N)? ");
            if(in.nextLine().equalsIgnoreCase("n")) {
                hasQuit = true;
            }
        }
    }
}

class MagicEightBall {
    private String[] answerArr = {"Yes", "No", "Maybe", "Ask again later"};
    private ArrayList<String> answers = new ArrayList<String>() {
        {
            add("Yes");
            add("No");
            add("Maybe");
            add("Ask again later");
        }
    };

    public String genAnswer() {
        return answers.get((int)(Math.random() * 3));
    }
}
