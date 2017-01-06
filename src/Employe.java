/**
 * Created by vishn on 12/22/2016.
 */
public class Employe {

    int number;
    String name;
    short age;
    double salary ;
    static String COMPANY_NAME = "XYZ Comp";

    public Employe(){
    salary =10000;
}


    public  static String displayCompany() {
        return COMPANY_NAME;
    }


    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public short getAge() {
        return age;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }


    public void diaplayEmpInfo(){

        System.out.println("Employee info"+"\n"+ "Name: " + name +"\n"+ "Number: "+number+"\n"+ "Salary: "+salary);
    }
    public double hra(){
        double hra = (salary * 0.2);
        return hra;

    }



}
