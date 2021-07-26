/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minLength, spChars, nums;
        String pass;

        System.out.print("What's the minimum length? ");
        minLength = Integer.parseInt(in.nextLine());
        System.out.print("How many special characters? ");
        spChars = Integer.parseInt(in.nextLine());
        System.out.print("How many numbers? ");
        nums = Integer.parseInt(in.nextLine());

        PassGenerator passGen = new PassGenerator(minLength, spChars, nums);
        pass = passGen.generatePass();

        System.out.printf("Your password is %s\n", pass);
    }
}

class PassGenerator {
    private int minLen;
    private final int spChAmount;
    private final int numAmount;

    private final List<String> nums, alphabet, spChars;

    public PassGenerator(int minLen, int spChAmount, int numAmount) {
        this.minLen = minLen;
        this.spChAmount = spChAmount;
        this.numAmount = numAmount;

        nums = new ArrayList<>();
        alphabet = new ArrayList<>();
        spChars = new ArrayList<>();

        nums.addAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        alphabet.addAll(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                    "m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        spChars.addAll(Arrays.asList("!", "@", "#", "$", "&"));

    }

    public String generatePass() {
        StringBuilder pass = new StringBuilder();

        List<String> charCollection = new ArrayList<>();

        charCollection.addAll(this.generateLetters());
        charCollection.addAll(this.generateNums());
        charCollection.addAll(this.generateSpecialChars());

        this.fixMinLen();

        for(int i = 0; i < minLen; i++) {
            int index = (int)(Math.random() * charCollection.size());
            pass.append(charCollection.get(index));
            charCollection.remove(index);
        }

        charCollection.clear();
        return pass.toString();
    }

     int fixMinLen() {
        int len = (spChAmount + numAmount) * 2;
        if( len > minLen) {
            minLen = len;
        }
        return minLen;
    }

    List<String> generateLetters() {
        ArrayList<String> selections = new ArrayList<>(minLen / 2);

        for(int i = 0; i < minLen / 2; i++) {
            String selection = alphabet.get((int)(Math.random() * alphabet.size()));
            selections.add(selection);
        }
        return selections;
    }

    List<String> generateSpecialChars() {
        ArrayList<String> selections = new ArrayList<>();

        for(int i = 0; i < spChAmount; i++) {
            String selection = spChars.get((int)(Math.random() * spChars.size()));
            selections.add(selection);
        }
        return selections;
    }

    List<String> generateNums() {
        ArrayList<String> selections = new ArrayList<>();

        for(int i = 0; i < numAmount; i++) {
            String selection = nums.get((int)(Math.random() * nums.size()));
            selections.add(selection);
        }
        return selections;
    }
}


// ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
// {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
//                    "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};