/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestApp {
    PassGenerator testPass = new PassGenerator(10, 3, 3);

    @Test
    void testFixMinLen() {
        int len = testPass.fixMinLen();
        Assertions.assertEquals(12, len);
    }

    @Test
    void testGenerateLetters() {
        List<String> first = testPass.generateLetters();
        List<String> second = testPass.generateLetters();

        Assertions.assertNotEquals(first, second);
    }

    @Test
    void testGenerateSPChars() {
        List<String> first = testPass.generateNums();
        List<String> second = testPass.generateNums();

        Assertions.assertNotEquals(first, second);
    }

    @Test
    void testGenerateNums() {
        List<String> first = testPass.generateNums();
        List<String> second = testPass.generateNums();

        Assertions.assertNotEquals(first, second);
    }

}
