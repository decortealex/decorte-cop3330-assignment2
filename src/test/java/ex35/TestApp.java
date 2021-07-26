/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    void testLottery() {
        Lottery test = new Lottery();
        String contestant = "test";

        test.addContestant(contestant);
        Assertions.assertEquals(contestant, test.selectWinner());
    }
}
