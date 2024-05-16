/*
Create an abstract class Accounts with the following details:

a) balance

b) accountNumber

c) accountHolders Name
d) address

Methods:

a) withdrawl(): abstract method

b) deposit(): abstract method
c) display(): to show the balance of the account number
 Create a subclass of this class Savings Account and add the following details:

Data Members

a) rateOfinterest

Methods

a) calculate Amount

b) display to display rateOfinterest with new balance and full account holders detalls.
 Create another subclass of the Accounts class, ie. CurrentAccount with the following:

Data Members:

a) overdraftLimit

Methods: a) display(): to show overdraft limit along with full account holders details.

Create object of these two classes and call their methods. Use appropriate constructors
*/

// Abstract class Accounts
abstract class Accounts {
    // Data Members
    protected double balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;

    // Constructor
    public Accounts(double balance, int accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    // Abstract methods
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    // Method to display account balance
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends Accounts {
    // Data Member
    private double rateOfInterest;

    // Constructor
    public SavingsAccount(double balance, int accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    // Method to calculate amount including interest
    public void calculateAmount() {
        balance += (balance * rateOfInterest / 100);
    }

    // Method to display account details with interest rate
    @Override
    public void display() {
        super.display();
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("New Balance after Interest: $" + balance);
    }

    // Implemented abstract methods
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Accounts {
    // Data Member
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(double balance, int accountNumber, String accountHoldersName, String address, double overdraftLimit) {
        super(balance, accountNumber, accountHoldersName, address);
        this.overdraftLimit = overdraftLimit;
    }

    // Method to display account details with overdraft limit
    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }

    // Implemented abstract methods
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}

public class Q17_BankAbstractClass {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(5000, 12345, "John Doe", "123 Main St", 3.5);
        savingsAccount.display(); // Display initial details
        savingsAccount.calculateAmount(); // Calculate interest
        System.out.println("After interest calculation:");
        savingsAccount.display(); // Display updated details

        // Creating a CurrentAccount object
        CurrentAccount currentAccount = new CurrentAccount(1000, 54321, "Jane Smith", "456 Elm St", 500);
        currentAccount.display(); // Display initial details
        currentAccount.withdraw(200); // Withdrawal within overdraft limit
        System.out.println("After withdrawal:");
        currentAccount.display(); // Display updated details
    }
}
