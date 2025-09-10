// Superclass: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate; // in percentage

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int depositTenure; // in months
    double interestRate;

    FixedDepositAccount(String accountNumber, double balance, int depositTenure, double interestRate) {
        super(accountNumber, balance);
        this.depositTenure = depositTenure;
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountDetails();
        System.out.println("Deposit Tenure: " + depositTenure + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Driver Class
public class BankDemo {
    public static void main(String[] args) {
        // Create objects of each account type
        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA102", 30000, 10000);
        FixedDepositAccount fda = new FixedDepositAccount("FD103", 100000, 12, 6.5);

        // Display account types and details
        System.out.println("=== Savings Account ===");
        sa.displayAccountType();
        System.out.println("---------------------");

        System.out.println("=== Checking Account ===");
        ca.displayAccountType();
        System.out.println("---------------------");

        System.out.println("=== Fixed Deposit Account ===");
        fda.displayAccountType();
    }
}
