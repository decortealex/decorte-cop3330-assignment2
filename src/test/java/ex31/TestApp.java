/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    void testCalcHR() {
        int age = 22, restingHR = 65, intensity = 85;

        Assertions.assertEquals(178, App.calcKarvonenHR(age, restingHR, intensity));
    }
}
