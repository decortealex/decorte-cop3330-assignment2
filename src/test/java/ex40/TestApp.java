/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex40;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestApp {
    public List<HashMap<Integer, String>> records = App.genRecords();
    public String query = "jac";
    public List<Integer> desiredQKeys = new ArrayList<>(Arrays.asList(3, 4));


    @Test
    void testGetKeysFromQuery() {


        Assertions.assertEquals(desiredQKeys, App.getKeysFromQuery(records, "jac"));
    }

    @Test
    void testToRecordsString() {
        String desired = "First Name          |Last Name           | Position           | Separation Date    |\n" +
                "--------------------|--------------------|--------------------|--------------------|\n" +
                "Jake                |Jacobson            |Programmer          |                    |\n" +
                "Jaquelyn            |Jackson             |DBA                 |                    |\n";

        Assertions.assertEquals(desired, App.toRecordsString(records, desiredQKeys));
    }
}
