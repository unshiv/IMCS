package com.trng.exersises.stringBuilder;

import java.util.*;
 import java.io.*;
 public class WordCount {

     public static void main(String[] args) throws FileNotFoundException {
         System.out.println("Number of Words: " + wordCounter());
         System.out.println("Number of Lines: " + lineCounter());


     }


     public static int wordCounter() throws FileNotFoundException {

         Scanner input = new Scanner(new File("C:\\Users\\vishn\\Desktop\\IMCS\\words.txt"));
         int countWords = 0;

         while (input.hasNextLine()) {
             if (input.hasNext()) {

                 countWords++;
             }

         }
         return countWords;
     }


     public static int lineCounter() throws FileNotFoundException {

         Scanner input2 = new Scanner(new File("C:\\Users\\vishn\\Desktop\\IMCS\\words.txt"));
         int countLines = 0;
         //while there are more lines
         while (input2.hasNextLine()) {
             if (input2.hasNext()) {

                 countLines++;
             }


         }
         return countLines;
     }

 }
