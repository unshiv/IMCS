package io;

import java.io.*;

class Student implements Serializable {
    private int id;  //Primitive type.
    private String name;  //String Object.
    private transient int age;//Now it will not be serialized.
    static String schoolName = "XYZ School"; //static won’t be serialized.

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayInformation() {
        System.out.println(" Student Id: " + id);
        System.out.println(" Student name : " + name);
        System.out.println(" Student age : " + age);
        System.out.println(" Student schoolName : " + schoolName);
    }
}

public class SerilizationUtil {
    void serializeStudent(Student s1, String fileName) { //This method write the given Student information into the file.
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            out.close();
            fout.close();
            System.out.println("success");
        } catch (NotSerializableException nse) {
            System.out.println("Could not serilize ");
            nse.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Could not serilize ");
            fnfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception in program");
            e.printStackTrace();
        }
    }


    /* Deserializes the student information from the given file */
    Student deserializeStudent(String fileName) {
        try {
            Student s1 = null;
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream oin = new ObjectInputStream(fin);

            s1 = (Student) oin.readObject();  //readObject returns Object type, need convert into the required type.
            oin.close();
            fin.close();
            return s1;
        } catch (NotSerializableException nse) {
            System.out.println("Could not serilize  ");
            nse.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Could not serilize  ");
            fnfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception in program ");
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String args[]) {
//        Student s1 = new Student(211, "ravi", 22);
//        s1.displayInformation();
        String fileName = "c:\\temp\\student.data";
        SerilizationUtil sutil = new SerilizationUtil();
//        sutil.serializeStudent(s1, fileName);
//
        Student s2 = sutil.deserializeStudent(fileName);
        s2.displayInformation();
    }

}


