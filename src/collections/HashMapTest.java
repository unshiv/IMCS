package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		simpleUse();
		complexUse();
	}
	
	private static void complexUse() {
		Employee e1 = new Employee("Raj", 1, 2000, 23);
		Employee e2 = new Employee("David", 2, 4000, 24);
		Employee e3 = new Employee("Raj", 1, 2000, 23);


		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1.hashCode() == e3.hashCode());

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, e1.getEname());
		map.put(e2, e2.getEname());
		
		System.out.println("Total values in map: " + map.size());
		System.out.println("Value of e1: " + map.get(e1));
		System.out.println("Value of e2: " + map.get(e2));
		System.out.println("Value of e3: " + map.get(e3));

		map.put(e3, "NewName");
		System.out.println("Value of e2: " + map.get(e1));
		System.out.println("Value of e3: " + map.get(e3));

		Map<String, Employee> nameAndEmployeeMap = new HashMap<>();
		nameAndEmployeeMap.put(e1.getEname(), e1);
		System.out.println("Value is: " + map.get(e1.getEname()));

	}

	public static void simpleUse() {
		Map<Integer, String> namesMap = new HashMap<>();

		namesMap.put(100, "Raju");
		namesMap.put(101, "John");
		namesMap.put(102, "Pingel");
		namesMap.put(100, "Kala");
		namesMap.put(106, "David");
		namesMap.put(109, "Praveen");

		System.out.println("Values in the map are: ");
		for (Map.Entry<Integer, String> entry : namesMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		System.out.println(" Name for the key: 106 is " + namesMap.get(106));

		namesMap.remove(106);

		System.out.println("Values after removing 106");
		Set<Integer> keys = namesMap.keySet();
		for (Integer key : keys) {
			System.out.println(key + " - " + namesMap.get(key));
		}
	}

}
