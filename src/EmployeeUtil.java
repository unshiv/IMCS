import collections.Employee;


/*public class EmployeeUtil {

    public void diaplayEmployee( Employee emp  ){

        emp.diaplayEmpInfo();

    }
    public Employee older(Employee emp1, Employee emp2){
        if(emp1.getAge() > emp2.getAge()){
            return emp1;
        }
        else {
            return emp2;
        }
    }

    public Employee maxSalary(Employee emp1, Employee emp2)
    {
        if(emp1.getSalary() > emp2.getSalary()){
            return emp1;
        }
        else {
            return emp2;
        }
    }
    public void  update(Employee emp){
        if ((emp.getSalary() < 1000) && (emp.getAge() >35))
        {
            emp.setSalary(emp.getSalary()*1.15);
        } else if ((emp.getSalary() < 1500) && (emp.getAge() >45))
        {
            emp.setSalary(emp.getSalary()*1.2);
        }else if((emp.getSalary() < 20000) && (emp.getAge() >55))
        {
            emp.setSalary(emp.getSalary()*1.25);
        }

    }
    public void  calDaHra(Employee emp){
        double da;
        double hra;
        double gSalary;
        if (emp.getSalary() < 10000) {
            da = emp.getSalary() * 0.08 ;
            hra = emp.getSalary() * 0.15 ;

        } else if (emp.getSalary() < 20000) {
            da = emp.getSalary() * 0.10 ;
            hra = emp.getSalary() * 0.20 ;

        }else if((emp.getSalary() < 30000) && (emp.getAge() >= 40))
        {
            da = emp.getSalary() * 0.15 ;
            hra = emp.getSalary() * 0.27 ;

        }else if ((emp.getSalary() < 30000) && (emp.getAge() < 40))
        {
            da = emp.getSalary() * 0.13;
            hra = emp.getSalary() * 0.25 ;

        }else{
            da = emp.getSalary() * 0.17 ;
            hra = emp.getSalary() * 0.30 ;

        }

        gSalary =((emp.getSalary()) + da+ hra);

    }
}
*/