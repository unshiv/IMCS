package demo;

class Employee {
    int empNo;
    String name;
    Float salary;
    double hra;


    {
        salary = 10000f;
    }

    public Employee() {
        System.out.println("Constructor called");
    }

    public Employee(int empno, String ename) {
        System.out.println("Parameterized Constructor called");
        this.empNo = empno;
        this.name = ename;
    }


    public Employee(int empno, String ename, float salary) {
        System.out.println("Parameterized Constructor called");
        this.empNo = empno;
        this.name = ename;
        this.salary = salary;
    }

    public void setEmployee(int empno, String ename) {
        empNo = empno;
        this.name = ename;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize called");
    }

    public static void main(String[] args) {

        {
            for(long x = 0; x<=2000; x++) {
                Employee emp = new Employee(101, "Raj");
            }
        }

        System.gc();
        if (args.length > 0) {
            for (String arg: args) {
                System.out.println(arg);
            }
        }

        Employee emp1 = new Employee();
        emp1.salary = 1000f;

        Employee emp4 = new Employee();
        emp4.salary = 2000f;

        Employee highestPaidEmployee = EmployeeUtil.highestSalary(emp1, emp4);

        Employee emp2 = emp1;
        Employee emp3 = emp1;


        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
        System.out.println(emp3.salary);

        System.out.println(emp2.salary);
        EmployeeUtil.display(emp2);
        System.out.println(emp2.salary);

        float x = 5;
        System.out.println(x);
        EmployeeUtil.test(x);
        System.out.println(x);

        System.out.println(EmployeeUtil.add(3, 5, 7, 455, 3443));
    }

    public static void displayEmp(Employee emp1) {
        if (emp1 == null) {
            return;
        }
        emp1.display(emp1);
    }

    public void display(Employee emp1) {
        System.out.println(emp1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hra=" + hra +
                '}';
    }
}

class EmployeeUtil {

    public static Employee highestSalary(Employee emp1, Employee emp2) {
        return emp1.salary > emp2.salary ? emp1 : emp2;
    }

    public static void display(Employee emp) {
        emp.salary = 3000f;
    }

    public static void test(float salary) {
        salary = 10f;
    }

    public static int add(int... x) {
        int sum = 0;
        for(int y : x) {
            sum = sum + y;
        }

        return sum;
    }
}
