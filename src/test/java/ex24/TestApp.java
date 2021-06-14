/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex24;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class TestApp {
    @Test
    public void testIsAnagram() throws Throwable {
        String s1 = "note";
        String s2 = "tone";
        boolean result = App.isAnagram(s1, s2);

        Assertions.assertEquals(true, result);
    }
}
