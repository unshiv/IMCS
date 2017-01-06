package inter;

import java.util.Scanner;

/**
 * Created by Manohar on 12/22/2016.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new ICICIBank();
        bank.deposit(100);
        bank.display();
        bank.withdraw(40);
        bank.display();

        Bank bank1 = null;

        System.out.println("Choose the bank: 1. ICICI, 2. AXIS");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:
                bank1 = new ICICIBank();
                break;
            case 2:
                bank1 = new AXISBank();
                break;
            default:
                System.out.println("No bank");
                break;
        }

        bank1.deposit(100);
        bank1.display();
        bank1.withdraw(30);
        bank1.display();

        if(bank instanceof ICICIBank) {
            System.out.println(((ICICIBank) bank).calculateInterest(10000));
        }
    }
}
