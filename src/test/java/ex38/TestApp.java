/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestApp {
    @Test
    void testFilterEvenNumbers() {

        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> desired = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        Assertions.assertEquals(desired, App.filterEvenNumbers(input));
    }
}
