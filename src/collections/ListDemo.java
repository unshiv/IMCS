package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Manohar on 12/25/2016.
 */
public class ListDemo {
    public static void main(String[] args) {
//        basicUsage();
        employeeListUsage();
    }

    private static void employeeListUsage() {
        Employee emp1 = new Employee("Raj", 1243, 3000, 25);
        Employee emp2 = new Employee("Raj", 1243, 3000, 25);

        System.out.println(emp1.equals(emp2));
    }

    private static void basicUsage() {

        String [] names = {"Name1", "Name2", "Name3", "Name4", "Name2"};
        String [] newNames = {"Name11", "Name12", "Name13"};
        List<String> namesList = convertToList(names);
        namesList.add(3, "NewName");
        System.out.println(namesList.remove("Name2"));
        System.out.println(namesList.remove("Name89"));
        displayNames(namesList);
        System.out.println(namesList.contains("Name2"));
        System.out.println(namesList.contains("Name10"));
        System.out.println(namesList.addAll(Arrays.asList(newNames)));
        displayNames(namesList);
        System.out.println(namesList.containsAll(Arrays.asList(newNames)));
        displayAndDeleteWithIterator(namesList);
        displayNames(namesList);

    }

    private static void displayAndDeleteWithIterator(List<String> namesList) {
        Iterator<String> iterator = namesList.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Name4")) {
                iterator.remove();
            }
        }
    }

    private static List convertToList(String[] names) {
        List<String> namesList = new ArrayList<>();
        for (String name : names) {
            namesList.add(name);
        }

        return namesList;
    }

    private static void displayNames(List<String> namesList) {
        /*for (int i=0; i<namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }*/

        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
