
public class ATM_Account {

    private String pin;
    private double balance;

    public ATM_Account(String pin, double balance) {
        if (verifyPinLength(pin)) {
            this.pin = pin;
        } else {
            System.out.println("Please enter a 4 digit pin, pin set to default '0000' ");
            this.pin = "0000";

        }

        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Amount entered || Setting Bank Balance to 0.0");
            this.balance = 0.0;
        }
        if (verifyPinLength(pin) && balance >= 0) {
            System.out.println("Account Created!");
        }

    }

    public void setPin(String oldPin, String newPin) {

        if (verifyPinLength(newPin) && this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println("Pin changed Successfully ");
        } else if (!this.pin.equals(oldPin)) {
            System.out.println("Wrong pin ");
        } else {
            System.out.println("Invalid pin , Pin must be a 4 digit number ");
        }
    }

    public boolean verifyPin(String pin) {
        // if (this.pin == pin) {
        //     return true;
        // } else {
        //     return false;
        // }
        return (this.pin.equals(pin)) ? true : false;
    }

    // private boolean verifyPinLength(String pin) {
    private boolean verifyPinLength(String pin) {
        return pin.matches("\\d{4}");
    }

    // int n = 0;
    // while (pin > 0) {
    //     n++;
    //     pin /= 10;
    // }
    // // System.out.println(n);
    // if (n == 4) {
    //     return true;
    // } else {
    //     return false;
    // }
    // check balance 
    public void showBalance(String pin) {
        if (verifyPin(pin)) {
            System.out.println("Available balance is : " + balance);
        } else {
            System.out.println("Invalid pin ");
        }
    }

    // withdraw amount 
    public void withdraw(String pin, double withdrawAmount) {
        if (!verifyPin(pin)) {
            System.out.println("Incorrect Pin");

        } else if (withdrawAmount > this.balance) {
            System.out.println("Insufficient Balance ");
        } else if (withdrawAmount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance -= withdrawAmount;
            System.out.println("Amount withdrawn ");
        }
    }

    // Deposit Money 
    public void deposit(double depAmount) {
        if (depAmount > 0) {
            this.balance += depAmount;
            System.out.println("Amount deposited ");
        } else {
            System.out.println("Deposit amount must be more than 0 ");
        }
    }

}
