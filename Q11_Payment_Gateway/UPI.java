
public class UPI extends Payment {

    public UPI(double amount) {
        super(amount, "UPI");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment of rs " + getAmount());
    }

}
