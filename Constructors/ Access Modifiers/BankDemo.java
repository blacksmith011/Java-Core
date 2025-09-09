class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account No: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%, Balance: $" + getBalance());
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Aryan Yadav", 5000);
        acc1.displayAccountDetails();
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.displayAccountDetails();

        SavingsAccount sa = new SavingsAccount(202, "Rahul Verma", 10000, 4.5);
        sa.displaySavingsAccountDetails();
    }
}
