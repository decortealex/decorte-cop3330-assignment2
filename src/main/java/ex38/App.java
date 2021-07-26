/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex38;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static List<Integer> filterEvenNumbers(List<Integer> from) {
        List<Integer> even = new ArrayList<>();
        int i;

        for(i = 0; i < from.size(); i++) {
            if(from.get(i) % 2 == 0)
                even.add(from.get(i));
        }

        return even;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String[] inputArr;
        ArrayList<Integer> intArr = new ArrayList<>();

        System.out.print("Enter a list of numbers, separated by spaces.");
        input = in.nextLine();
        inputArr = (input.split(" "));

        for (String s : inputArr) {
            intArr.add(Integer.parseInt(s));
        }

        List<Integer> filtered = filterEvenNumbers(intArr);

        System.out.print("The even numbers are ");
        System.out.print(filtered);
    }
}
