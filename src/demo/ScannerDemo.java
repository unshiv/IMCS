package demo;

import java.util.Scanner;

/**
 * Created by Manohar on 12/21/2016.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        int x = scanner.nextInt();
        System.out.println("Enter a value");
        int y = scanner.nextInt();
        System.out.println("Sum of given values: " + (x+y));
    }
}
