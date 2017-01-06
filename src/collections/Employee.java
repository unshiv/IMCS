package collections;

/**
 * Created by gopichand on 12/23/2016.
 */
public class Employee
{
    public String ename;
    public int eno;
    private float salary;
    public int age;
    private static String companyname = "xyz company";
    public Employee() {
    }

    public Employee(String ename, int eno, float salary, int age )
    {
        this.ename = ename;
        this.eno = eno;
        this.salary = salary;
        this.age = age;

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary)
    {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("equals called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (eno != employee.eno) return false;
        if (Float.compare(employee.salary, salary) != 0) return false;
        if (age != employee.age) return false;
        return ename != null ? ename.equals(employee.ename) : employee.ename == null;

    }

    @Override
    public int hashCode() {
//        System.out.println("hashcode called");
        int result = ename != null ? ename.hashCode() : 0;
        result = 31 * result + eno;
        result = 31 * result + (salary != +0.0f ? Float.floatToIntBits(salary) : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", eno=" + eno +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
