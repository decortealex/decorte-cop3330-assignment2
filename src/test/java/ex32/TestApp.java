/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    void testNumberGuess() {
        NumberGuess test = new NumberGuess(3);
        test.genTargetNum();

        Assertions.assertTrue(test.getTargetNum() <= 1000 && test.getTargetNum() >= 0);
        Assertions.assertEquals(0, test.valGuess(test.getTargetNum()));
    }
}
