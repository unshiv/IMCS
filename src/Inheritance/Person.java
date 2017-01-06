package Inheritance;

import java.util.Arrays;

/**
 * Created by vishn on 12/23/2016.
 */
public class Person {
    private String p_name;
    private String p_address;

    public String getName()
    {
        return p_name;
    }
    public void setAddress()
    {
        this.p_address=p_address;
    }

    public String getAddress()
    {
        return p_address;
    }

    public String toString()
    {
        return "name: " + p_name + ", address: "  + p_address;
    }


}
class Student extends Person{
    private String[] s_courses;
    private int[] s_grades;
    private int numCourses;



    double avgGrade;

    public String[] getS_courses() {
        return s_courses;
    }

    public int[] getS_grades() {
        return s_grades;
    }

    public int getNumCourses() {
        return numCourses;
    }
    public void addCourseGrade(String course , int grade){

    }
    public void printGrades(){

    }
    public double getAvgGrade() {
        avgGrade =0;
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_courses=" + Arrays.toString(s_courses) +
                ", s_grades=" + Arrays.toString(s_grades) +
                ", numCourses=" + numCourses +
                '}';
    }
}
class Teacher extends Person{
    private String[] t_courses;
    private int numCourses;

    public String[] getT_courses() {
        return t_courses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_courses=" + Arrays.toString(t_courses) +
                ", numCourses=" + numCourses +
                '}';
    }
}