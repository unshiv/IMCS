package exep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {
    public static void main(String a[]) {
        int[] vals = {4, 2, 0, 5, 6};
        for (int i = 4; i >= 0; i--) {
            try {
                div(10, vals[i]);
//                readFile();
                //lilne4
                //line5
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } /*catch (FileNotFoundException e) {
                e.printStackTrace();
            } */finally {
                System.out.println("I am from finally");
            }
        }
        System.out.println("After for loop...");
    }

    private static void div(int num, int val) throws BusinessException {

        if(val == 0) {
            throw new BusinessException("Can't devide by zero");
        }

        System.out.println(num / val);

    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("c:\\");
        file.exists();
        FileInputStream fis = new FileInputStream(file);
    }

//                try {
//        System.out.println(10 / vals[i]);
//    } catch(ArithmeticException e) {
//        System.out.println("can't devide with " + vals[i] + e.getMessage());
//    }

}
