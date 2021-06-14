/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex25;

import org.junit.jupiter.api.*;

public class TestApp {

    @Test
    void testPasswordValidatorVeryWeak() {
        String VWPass = "1234";
        Assertions.assertEquals(0, App.passwordValidator(VWPass));
    }

    @Test
    void testPasswordValidatorWeak() {
        String WPass = "abcde";
        Assertions.assertEquals(1, App.passwordValidator(WPass));
    }

    @Test
    void testPasswordValidatorStrong() {
        String SPass = "abc12de34";
        Assertions.assertEquals(2, App.passwordValidator(SPass));
    }

    @Test
    void testPasswordValidatorVeryStrong() {
        String VSPass = "abc12de34!@";
        Assertions.assertEquals(3, App.passwordValidator(VSPass));
    }
}
