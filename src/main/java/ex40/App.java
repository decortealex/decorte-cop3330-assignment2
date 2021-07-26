/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex40;

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

    public static String toRecordsString(List<HashMap<Integer, String>> records, List<Integer> keysToPrint) {
        StringBuilder output = new StringBuilder();

        output.append("First Name          |");
        output.append("Last Name           |");
        output.append(" Position           |");
        output.append(" Separation Date    |");
        output.append("\n--------------------|--------------------|--------------------|--------------------|\n");

        for(int key : keysToPrint) {
            for( HashMap<Integer, String> map : records) {
                output.append(map.get(key));
                output.append(" ".repeat(Math.max(0, (20 - map.get(key).length()))));
                output.append("|");
            }
            output.append("\n");
        }


        return output.toString();
    }

    public static List<Integer> getKeysFromQuery(List<HashMap<Integer, String>> records, String query) {
        List<Integer> matchingKeys = new ArrayList<>();

        for(int i = 0; i <= 1; i++) {
            for(Map.Entry<Integer, String> e : records.get(i).entrySet()) {
                if(e.getValue().toLowerCase().contains(query.toLowerCase())) {
                    if(!matchingKeys.contains(e.getKey()))
                        matchingKeys.add(e.getKey());
                }
            }
        }

        return matchingKeys;
    }

    public static void main(String[] args) {
        List<HashMap<Integer, String>> records = genRecords();
        List<Integer> keysFromQuery;
        Scanner in = new Scanner(System.in);
        String query;

        System.out.print("Enter a search string: ");
        query = in.nextLine();

        keysFromQuery = getKeysFromQuery(records, query);
        System.out.print(toRecordsString(records, keysFromQuery));

    }
}
