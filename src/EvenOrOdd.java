/**
 * Created by vishn on 12/22/2016.
 */

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[])
    {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to check weather it is even or odd ");
        x = scanner.nextInt();

        if ( x % 2 == 0 )
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
