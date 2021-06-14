/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex30;

public class App {
    public static void genMultTable() {
        int i, j;
        int[] buf = new int[12];

        for(i = 1; i <= 12; i++) {
            for(j = 1; j <= 12; j++) {
                buf[j-1] = j * i;
                System.out.printf("%5d", buf[j-1]);
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        genMultTable();
    }
}
