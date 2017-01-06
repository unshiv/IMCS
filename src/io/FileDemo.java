package io;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Manohar on 12/24/2016.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\temp\\test.txt");
//        displayFileInfo(file);
//        readFile(file);
//        readFileEfficiently(file);
//        readFileWitByteApi(file);
//        readFileEfficientlyUsingByteAPI(file);
        writeFile();
    }

    private static void writeFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path to create");
        String filePath = scanner.next();
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File already exist");
            return;
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String input = null;
        System.out.println("Continue to input, type exit to exit");
        do {
            input  = scanner.next();
            bufferedWriter.write(input + "\n");
        } while (! input.equalsIgnoreCase("exit"));

        bufferedWriter.flush();
        fileWriter.flush();

        bufferedWriter.close();
        fileWriter.close();
    }

    private static void readFileWitByteApi(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        int data;
        do {
            data = fis.read();
            System.out.print((char) data);
        } while(data != -1);
    }


    private static void readFileEfficientlyUsingByteAPI(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] data = new byte[1024];
        do {
            bis.read(data);
            for(byte b : data) {
                System.out.print((char) b);
            }
            if (bis.available() <= 0) break;
        } while(true);
    }


    private static void readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        int data;
        do {
            data = fileReader.read();
            System.out.print((char) data);
        } while(data != -1);
    }



    private static void readFileEfficiently(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data;
        do {
            data = bufferedReader.readLine();
            if (data == null) break;
            System.out.println(data);
        } while(data != null);
    }

    private static void displayFileInfo(File file) {
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
