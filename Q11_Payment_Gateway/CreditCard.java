
public class CreditCard extends Payment {

    public CreditCard(double amount) {
        super(amount, "CC");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment of rs " + getAmount());
    }
}
