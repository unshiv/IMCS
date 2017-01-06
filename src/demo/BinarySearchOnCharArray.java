package demo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchOnCharArray {
 
    public static void main(String a[]){
        char[] chrArr = {'a','c','d','y','e','q','b'};
        Employee[] employees = new Employee[3];
        System.out.println("Enter data");
        char searchCh = new Scanner(System.in).next().charAt(0);
        display(chrArr);
        replaceChar(chrArr, searchCh, 'x');
        display(chrArr);

        readData(employees);
        displayEmployees(employees);
    }

    private static void displayEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void readData(Employee[] employees) {
        int eno = 100;
        for (int i=0; i<employees.length; i++) {
            employees[i] = new Employee();
            employees[i].setEmployee(eno, "Name " + eno);
            eno++;
        }
    }

    private static void replaceChar(char[] chrArr, char searchCh, char x) {
        for(int i=0; i<chrArr.length; i++) {
            if (chrArr[i] == searchCh) {
                chrArr[i] = x;
            }
        }
    }
    private static void display(char[] chrArr) {
        for(char chr : chrArr) {
            System.out.print(" " + chr);
        }

        System.out.println(" ");
    }
}