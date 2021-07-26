/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestApp {
    static Statistics test;

    static double arr[] = {10, 25, 40};
    static double avg = 25, max = 40, min = 10, std = 15;

    @BeforeAll
    static void initialize() {
        test = new Statistics();
        for(int i = 0; i < arr.length; i++) {
            test.addData(arr[i]);
        }
    }

    @Test
    void testaverage() {
        Assertions.assertEquals(avg, test.average());
    }

    @Test
    void testMax() {
        Assertions.assertEquals(max, test.max());
    }
}
