
public class Main {

    public static void main(String[] args) {

        // Payment p1 = new UPI(1000.0);
        Payment[] payments = {new UPI(1000.0), new CreditCard(2000.0), new NetBanking(3000),
            new UPI(4000.0), new CreditCard(5000.0), new NetBanking(6000)
        };

        for (Payment pays : payments) {
            pays.showAmount();
            pays.processPayment();
            pays.showTransactionId();
            System.out.println();

        }

    }

}
