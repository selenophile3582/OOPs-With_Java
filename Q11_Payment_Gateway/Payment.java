
abstract class Payment {

    private double amount;
    private static int counter = 0;
    private String transactionId;

    public Payment(double amount, String mode) {
        counter++;
        this.transactionId = mode + String.format("%06d", counter);
        if (amount > 0) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }

    // 
    public abstract void processPayment();

    public double getAmount() {
        return amount;
    }

    public void showTransactionId() {
        System.out.println("TNX id : " + transactionId);
    }

    public void showAmount() {
        System.out.println("Available Amount : " + amount);
    }

}


/* 
Industry-Level Version (Not for rewriting now)

Eventually a payment class would look more like:

private double amount;
private String transactionId;
private String paymentDate;

and

public abstract void processPayment();

with validation and exceptions.
 */
