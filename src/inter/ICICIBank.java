package inter;

/**
 * Created by Manohar on 12/22/2016.
 */
public class ICICIBank implements BankOperations {
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

    @Override
    public double calculateInterest(double amount) {
        return (amount * 12 * 2)/100;
    }

    @Override
    public void fixedDeposit() {
        System.out.println("Fixed deposit done");
    }
}
