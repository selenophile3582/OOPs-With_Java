
public class NetBanking extends Payment {

    public NetBanking(double amount) {
        super(amount, "NB");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Net Banking payment of rs " + getAmount());
    }
}
