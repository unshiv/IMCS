package gc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1. Play with Heap \n 2. Play with Stack \n 3. Exit");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				playWithHeap();
				break;
			case 2:
				playWithStack();
				break;
			}
		} while (option != 3);

		System.out.println("Program complete");
	}

	// -Xss to specify stack memory size.
	private static void playWithStack() {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("1. Load Classes \n 2. Trigger stack overlow exception \n 3. Call GC 4. Exit");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Yet to do");
				break;
			case 2:
				infiniteRecursive(1);
				break;
			case 3:
				System.gc();
				break;
			case 4:
				break;
			}	
		} while (option != 4);
	}
	
	private static void infiniteRecursive(long l) {
		System.out.println("infiniteRecursive function called " + l);
		
		if (l > 6000) {
			return;
		}
		infiniteRecursive(++l);
	}

	static void testPermGen() throws ClassNotFoundException {
		for (long i = 0; i < 1000000; i++) {
			Class.forName("inheritence.prsn.Employee");
		}
	}

	static void playWithHeap() {
		List<Employee> employees = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
//		new Thread(new PrintNumbers()).start();
		do {
			System.out.println("1. Load Objects \n 2. Remove reference \n 3. Call GC 4. Trigger Outof Memory Situation 5. Exit");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				for (long i = 0; i < 1000000; i++) {
					Employee e = new Employee();
					employees.add(e);
				}
				System.out.println("Loading complete");
				break;
			case 2:
				employees = new ArrayList<>();
				break;
			case 3:
				System.gc();
				break;
			case 4:
				boolean con = true;
				for (long i = 0; i < 1000000000; i++) {
					Employee e = new Employee();
					employees.add(e);
				}
				break;
			default:
				System.out.println("Not a valid option");
				break;
			}

		} while (option != 4);

	}
}

class PrintNumbers implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}


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
}