/**
 * Created by vishn on 12/22/2016.
 */
import java.util.Scanner;



public class ArrayTest {
    public static boolean contains(int[] a, int x) {
        for (int n : a) {
            if (x == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int sum = 0;
        System.out.println("Enter all the elements:");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        for (int num : a) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements is:" + sum);
        System.out.print("total  numbers:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                System.out.print(a[i] + "  ");
            }
        }
        System.out.println("The number of even elements are:");
        int evenCount = 0;
        for (int i = 0; i < 10; i++)
        {

            if (a[i] % 2 == 0) ;
            evenCount++;

        }


            System.out.print("even index numbers:");
            for (int i = 1; i < a.length; i = i +2) {
                System.out.println(a[i]);
            }



        }


    }



