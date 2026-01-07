package Day_4;

class Account {
    static int accCounter = 1000;
    int accNo;
    String name;
    String accType;
    double balance;
    int day, month, year;

    Account(String name, String accType, double balance, int d, int m, int y) {
        this.accNo = ++accCounter;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        this.day = d;
        this.month = m;
        this.year = y;
        System.out.println("Account created successfully. Account No: " + accNo);
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs " + amount + " deposited on " + day + "/" + month + "/" + year);
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal operation in Account class");
    }
}

// Standard Account
class StandardAccount extends Account {

    StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 100000) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn without charges.");
        }
        else if (amount <= 500000) {
            double penalty = amount * 0.005;
            balance -= (amount + penalty);
            System.out.println("Rs " + amount + " withdrawn with penalty Rs " + penalty);
        }
        else {
            System.out.println("Withdrawal limit exceeded for Standard Account.");
        }
    }
}

// Premium Account
class PremiumAccount extends Account {

    PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 1000000) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully (Premium Account).");
        } else {
            System.out.println("Daily limit exceeded for Premium Account.");
        }
    }
}

// Driver class
public class BankDemo {
    public static void main(String[] args) {

        Account a1 = new StandardAccount("Ravi", 600000, 5, 1, 2026);
        Account a2 = new PremiumAccount("Amit", 1500000, 6, 1, 2026);

        System.out.println("\n--- Standard Account Transactions ---");
        a1.deposit(50000);
        a1.withdraw(200000);
        a1.checkBalance();

        System.out.println("\n--- Premium Account Transactions ---");
        a2.deposit(100000);
        a2.withdraw(800000);
        a2.checkBalance();
    }
}
