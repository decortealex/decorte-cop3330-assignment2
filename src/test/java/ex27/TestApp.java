/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    String name = "ab";
    String id = "AB-1234";
    String zip = "33444";

    @Test
    void testValName() {
        Assertions.assertTrue(App.valName(name));
    }

    @Test
    void testValID() {
        Assertions.assertTrue(App.valID(id));
    }

    @Test
    void testValZIP() {
        Assertions.assertTrue(App.valZIP(zip));
    }
}
