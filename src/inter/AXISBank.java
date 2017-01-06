package inter;

/**
 * Created by Manohar on 12/22/2016.
 */
public class AXISBank implements Bank {
    double totalAmount;

    @Override
    public void deposit(double amount) {
        totalAmount = totalAmount + amount;
    }

    @Override
    public void withdraw(double amount) {
        totalAmount = totalAmount - amount;
    }

    @Override
    public void display() {
        System.out.println("Balance is: " + totalAmount);
    }
}
