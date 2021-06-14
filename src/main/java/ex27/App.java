/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex27;

import java.util.Scanner;

public class App {
    public static boolean valName(String name) {
        int len = name.length();
        return (len >= 2);
    }

    public static boolean valID(String empID) {
        char[] ID = empID.toCharArray();
        int i, len = empID.length();

        if(len != 7) {  // ID has to be 7 chars long
            return false;
        }

        for(i = 0; i < 2; i++) { // first 2 chars have to be letters
            if(!((ID[i] >= 'A' && ID[i] <= 'Z') || (ID[i] >= 'a' && ID[i] <= 'z'))) { // ASCII: 65-90 (A-Z), 97-122 (a-z)
                return false;
            }
        }

        if(ID[2] != '-')  // third char has to be hyphen
            return false;

        for(i = 3; i < ID.length; i++) { // remaining chars have to be numbers.
            if(!(ID[i] > '0' && ID[i] < '9')) {
                return false;
            }
        }

        return true;
    }

    public static boolean valZIP(String zip) {
        int len = zip.length();

        if(len != 5) // zipcode must be 5 digit number
            return false;

        try {
            int zipCode = Integer.parseInt(zip); // if parseInt() throws NFE, zip is not numeric
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void validateInput(String fName, String lName, String zip, String empID) {
        boolean fNameVal, lNameVal, zipVal, IDVal;
        fNameVal = valName(fName);
        lNameVal = valName(lName);
        zipVal = valZIP(zip);
        IDVal = valID(empID);

        if(!fNameVal)
            System.out.println("The first name must be at least 2 characters long.");
        if(!lNameVal)
            System.out.println("The last name must be at least 2 characters long.");
        if(!IDVal)
            System.out.println("The employee ID must be in the format of AA-1234.");
        if(!zipVal)
            System.out.println("The zipcode must be a 5 digit number.");
        if(fNameVal && lNameVal && zipVal && IDVal)
            System.out.println("There were no errors found.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fName, lName, zip, employeeID;

        System.out.print("Enter the first name: ");
        fName = in.nextLine();
        System.out.print("Enter the last name: ");
        lName = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        employeeID = in.nextLine();

        validateInput(fName, lName, zip, employeeID);
    }
}
