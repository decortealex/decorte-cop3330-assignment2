/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class TestApp {

    public List<HashMap<Integer, String>> records = App.genRecords();

    @Test
    void testGetPrintOrder() {
        int[] desired = {4, 3, 0, 2, 5, 1};
        Assertions.assertArrayEquals(desired, App.getPrintOrder(records));
    }

    @Test
    void testToSortedRecordsString() {
        String desired = "First Name          |Last Name           | Position           | Separation Date    |\n" +
                "--------------------|--------------------|--------------------|--------------------|\n" +
                "Jaquelyn            |Jackson             |DBA                 |                    |\n" +
                "Jake                |Jacobson            |Programmer          |                    |\n" +
                "John                |Johnson             |Manager             |2016-12-31          |\n" +
                "Michaela            |Michaelson          |District Manager    |2015-12-19          |\n" +
                "Sally               |Webber              |Web Developer       |2015-12-18          |\n" +
                "Tou                 |Xiong               |Software engineer   |2016-10-05          |\n";

        Assertions.assertEquals(desired, App.toSortedRecordsString(records));
    }
}
