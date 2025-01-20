// Taking an example of bank account
//private feilds
//Getter and setter method to access private feilds
// Encapsulation is process of binding of data and storing classes ,methods,variables 
//in a capsule


class BankAccount {
    // Only accessible within class
    private String accountHolderName;
    private double balance;

    // constructor
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Getter 
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter 
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance 
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create 
        BankAccount account = new BankAccount("John Doe", 1000.0);

        // 
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: " + account.getBalance());

       
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());

       
        account.withdraw(300);
        System.out.println("Updated Balance: " + account.getBalance());

        
        account.withdraw(1500);

        // Modifying 
        account.setAccountHolderName("Jane Smith");
        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
    }
}
