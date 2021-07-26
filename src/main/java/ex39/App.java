/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex39;

import java.util.*;

public class App {
    public static List<HashMap<Integer, String>> genRecords() {
        List<HashMap<Integer, String>> records = new ArrayList<>();

        HashMap<Integer,String> fNameMap = new HashMap<>();
        String[] fNames = {"John", "Tou", "Michaela", "Jake", "Jaquelyn", "Sally"};

        for(int i = 0; i < fNames.length; i++) {
            fNameMap.put(i, fNames[i]);
        }
        records.add(fNameMap);

        HashMap<Integer, String> lNameMap = new HashMap<>();
        String[] lNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};

        for(int i = 0; i < lNames.length; i++) {
            lNameMap.put(i, lNames[i]);
        }
        records.add(lNameMap);

        HashMap<Integer, String> posMap = new HashMap<>();
        String[] positions = {"Manager", "Software engineer", "District Manager", "Programmer", "DBA", "Web Developer"};

        for(int i = 0; i < positions.length; i++) {
            posMap.put(i, positions[i]);
        }
        records.add(posMap);

        HashMap<Integer, String> sepDateMap = new HashMap<>();
        String[] sepDates = {"2016-12-31", "2016-10-05", "2015-12-19", " ", " ", "2015-12-18"};

        for(int i = 0; i < sepDates.length; i++) {
            sepDateMap.put(i, sepDates[i]);
        }
        records.add(sepDateMap);

        return records;
    }

    public static int[] getPrintOrder(List<HashMap<Integer, String>> records) {
        int[] order = new int[6];
        Map<String, Integer> sorter = new TreeMap<>();

        for(Map.Entry<Integer, String> e : records.get(1).entrySet()) {
            sorter.put(e.getValue(), e.getKey());
        }

        int i = 0;
        for(Map.Entry<String, Integer> e : sorter.entrySet()) {
            order[i] = e.getValue();
            i++;
        }

        return order;
    }

    public static String toSortedRecordsString(List<HashMap<Integer, String>> records) {
        StringBuilder output = new StringBuilder();

        output.append("First Name          |");
        output.append("Last Name           |");
        output.append(" Position           |");
        output.append(" Separation Date    |");
        output.append("\n--------------------|--------------------|--------------------|--------------------|\n");
        int[] order = getPrintOrder(records);
        for(int key : order) {
            for( HashMap<Integer, String> map : records) {
                output.append(map.get(key));
                for(int i = 0 ; i < (20 - map.get(key).length()); i++) {
                    output.append(" ");
                }
                output.append("|");
            }
            output.append("\n");
        }


        return output.toString();
    }

    public static void main(String[] args) {
        List<HashMap<Integer, String>> records = genRecords();

        System.out.print(toSortedRecordsString(records));
    }
}
