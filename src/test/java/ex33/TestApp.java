/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    @Test
    void testMagicEightBall() {
        MagicEightBall testBall = new MagicEightBall();

        String expected[] = {"Yes", "No", "Maybe", "Ask again later"};
        List<String> expectedList = Arrays.asList(expected);

        assertTrue(expectedList.contains(testBall.genAnswer()));
    }
}
