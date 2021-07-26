/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex26;

import org.junit.jupiter.api.*;

public class TestApp {
    @Test
    void testCalculateMonthsUntilPaidOff() {
        PaymentCalculator testing = new PaymentCalculator(12, 5000, 100);

        Assertions.assertEquals(70, testing.calculateMonthsUntilPaidOff());
    }
}
