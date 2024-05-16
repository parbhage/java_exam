/*
Modify the above program to incorporate 
a constructor to provide initial values.
*/
public class Q10_bank {
    // Data Members
    private int accountNumber;
    private String depositorName;
    private double balance;
    private String accountType;

    // Constructor to assign initial values
    public Q10_bank(int accountNumber, String depositorName, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.depositorName = depositorName;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    // Method to withdraw an amount after necessary checking for available balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }

    // Method to display the name of the depositor and balance
    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Balance: $" + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object with initial values
        Q10_bank myAccount = new Q10_bank(123456789, "John Doe", 1000.0, "Savings");
        
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.display();
    }
}
