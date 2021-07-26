/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {
    @Test
    void testEmpList() {
        EmpList testList = new EmpList();
        String testName = "Jeremy Goodwin";

        testList.rmEmp(testName);
        Assertions.assertFalse((testList.getList()).contains(testName));
    }
}
