
public class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, String holderName, double balance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            System.out.println("Please enter a valid Account Number ");
        } else {
            this.accountNumber = accountNumber;
        }
        if (holderName == null || holderName.isBlank()) {
            System.out.println("Please enter a valid Number ");
        } else {
            this.holderName = holderName;
        }

        if (balance < 0) {
            System.out.println("Initial balance cannot be negative ");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    //Deposite method 

    public void deposit(double a) {
        if (a > 0) {
            this.balance += a;
            System.out.println("Amount deposited successfully  !");
            System.out.println("Your available balance is : " + balance);
        } else {
            System.out.println("Amount less than 1 , cannot be deposited ");
        }
    }

    //Withdraw Method 
    public void withdraw(double a) {
        if (a <= 0) {
            System.out.println("Withdrawl amount must be greater than 0 ");
        } else if (this.balance - a < 0) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Successfully Withdrawn ");
            this.balance -= a;
            System.out.println("Your available balance is : " + balance);
        }
    }

    // check balance
    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    //money transfer 
    public void transferMoney(BankAccount receiver, double amount) {

        if (receiver == null || receiver.accountNumber == null || receiver.accountNumber.isBlank()) {
            System.out.println("Receiver not found");
        } else if (amount <= 0) {
            System.out.println("Amoun less than 1 , cannot be transfered ");
        } else if (this.balance < amount) {
            System.out.println("Insufficient balance ");
        } else {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Amount transfered Successfully to " + receiver.holderName);

        }

    }

    // get Account number 
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getHolderName() {
        return this.holderName;
    }

}

