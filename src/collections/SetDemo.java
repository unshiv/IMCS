package collections;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
//		simpleSet();
		complextSet();
	}
	

	private static void complextSet() {
		Set<Employee> empSet = new HashSet<>();
		
		for(int i=0; i<500000; i++) {
			empSet.add(new Employee("Raj" + "-" + i, i + 1, 4000, 20));
		}
		
		Employee e = new Employee("Raj-449997", 449998, 4000, 20);
		
		long time = new Date().getTime();
		System.out.println("is given employee present in list: " + empSet.contains(e));
		System.out.println(" Total time is: " + (new Date().getTime() - time));
	}

	private static void simpleSet() {
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(1);
		numbers.add(6);
		numbers.add(6);
		numbers.add(8);
		numbers.add(3);
		numbers.add(13);
		numbers.add(7);
		numbers.add(2);
		
		System.out.println("Origional data");
		for (Integer integer : numbers) {
			System.out.println(integer);
		}

		System.out.println("element 6 remove, data is: ");
		for (Iterator iterator = numbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
			if(integer == 6) {
				iterator.remove();
			}
		}
		
		int sum = 0;
		for (Integer integer : numbers) {
			sum = sum + integer;
			System.out.println(integer);
		}
		
		System.out.println("sum is: " + sum);
		
		
		numbers.add(60);
		
		System.out.println("element 60 added, and data is: ");
		for (Integer number : numbers) {
			System.out.println(number);
		}

		System.out.println("Element 60 removed, data is");
		System.out.println("Removed " + numbers.remove(new Integer(60)));

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}
