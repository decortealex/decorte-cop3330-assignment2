/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex32;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int difficulty = 0, guess = 0, wrongGuesses = 0;
        boolean isValid = false, hasQuit = false, isRight = false;

        while(!hasQuit) {
            System.out.println("Let's play Guess the Number!");
            while (!isValid) {
                try {
                    System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
                    difficulty = Integer.parseInt(in.nextLine());
                    if (difficulty < 1 || difficulty > 3) {
                        throw new NumberFormatException();
                    }
                    isValid = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("That is not a valid input.");
                }
            }

            NumberGuess newGame = new NumberGuess(difficulty);
            newGame.genTargetNum();
            System.out.print("I have my number. What's your guess? ");
            while(!isRight) {
                try {
                    guess = Integer.parseInt(in.nextLine());
                    if(newGame.valGuess(guess) == 0) {
                        System.out.printf("You guessed it in %d guesses!\n", wrongGuesses);
                        isRight = true;
                        break;
                    } else if(newGame.valGuess(guess) < 0) {
                        System.out.print("Too low. Guess again: ");
                        wrongGuesses++;
                    } else {
                        System.out.print("Too high. Guess again: ");
                        wrongGuesses++;
                    }
                } catch(NumberFormatException nfe) {
                    System.out.println("Wrong guess! Try a number!");
                    wrongGuesses++;
                }
            }

            System.out.print("Do you wish to play again (Y/N)? ");
            if((in.nextLine()).equalsIgnoreCase("y")) {
                isRight = false;
            } else {
                hasQuit = true;
                break;
            }
        }
    }
}

class NumberGuess {
    private final int difficulty;
    private int targetNum;

    public NumberGuess(int difficulty) {
        this.difficulty = difficulty;
    }

    public void genTargetNum() {
        switch (this.difficulty) {
            case 1 -> targetNum = (int) (Math.random() * 10.0);
            case 2 -> targetNum = (int) (Math.random() * 100.0);
            case 3 -> targetNum = (int) (Math.random() * 1000.0);
            default -> targetNum = 0;
        }
        System.out.println("target = " + targetNum);
    }

    public int valGuess(int guess) {
        return guess - targetNum;
    }
}


