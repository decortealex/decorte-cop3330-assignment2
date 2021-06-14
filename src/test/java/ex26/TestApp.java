package ex26;

import org.junit.jupiter.api.*;

public class TestApp {
    @Test
    void testCalculateMonthsUntilPaidOff() {
        PaymentCalculator testing = new PaymentCalculator(12, 5000, 100);

        Assertions.assertEquals(70, testing.calculateMonthsUntilPaidOff());
    }
}
