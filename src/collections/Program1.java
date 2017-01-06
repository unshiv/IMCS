package collections;

import java.util.Scanner;

/**
 * Created by vishn on 12/30/2016.
 */
public class Program1 {

        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            int a[] = new int[n];
            int sum =0;
            System.out.println("Enter  the elements:");

            //display even numbers logic

            for (int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            System.out.print("Even numbers:");
            for(int i = 0 ; i < n ; i++)
            {
                if(a[i] % 2 == 0)
                {
                    System.out.print(a[i]+" ");
                }
            }

//display sum of numbers logic

            for (int i=0; i<10; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.print("sum :");
            for( int num : a) {
                sum = sum+num;
                System.out.println("Sum of array elements is"+ sum);
        }

//remove all numbers greater than 30 and display logic

            System.out.println("numbers which are greater than 30:");
            for(int i = 0 ; i < n ; i++)
            {
                if(a[i] < 30)
                {
                    System.out.print(a[i]+" ");
                }
            }



        }


    }

