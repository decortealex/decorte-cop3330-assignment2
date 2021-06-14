/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 2 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */
package ex34;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
            EmpList employeeList = new EmpList();
            Scanner in = new Scanner(System.in);
            boolean hasQuit = false;
            while(!hasQuit) {
                employeeList.print();

                System.out.print("Enter an employee name to remove: ");
                employeeList.rmEmp(in.nextLine());
                System.out.print("Would you like to remove another employee? (y/n) ");
                if(in.nextLine().equalsIgnoreCase("n")) {
                    hasQuit = true;
            }
        }
    }
}

class EmpList {
    private ArrayList<String> list = new ArrayList<String>() {
        {
            add("John Smith");
            add("Jackie Jackson");
            add("Chris Jones");
            add("Amanda Cullen");
            add("Jeremy Goodwin");
        }
    };

    public void rmEmp(String empName) {
        boolean empFound = false;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase(empName)) {
                list.remove(i);
                empFound = true;
            }
        }
        if(!empFound) {
            System.out.printf("Employee '%s' could not be found.\n", empName);
        }
        print();
    }

    public void print() {
        System.out.printf("There are %d employees\n", list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
