public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("BOI3033","Siddharth Aryan",0);

        b1.deposit(100);
        b1.withdraw(200);
        b1.withdraw(50);

        BankAccount b2 = new BankAccount("SBI001", "Dhiraj Kumar", 1000);
        b2.showBalance();
        b2.deposit(1000);
        b2.transferMoney(b1, 3000);
        b2.transferMoney(b1, 1000);

        b1.showBalance();
        b2.showBalance();

        String acNo1 = b1.getAccountNumber();
        System.out.println(acNo1);

        String name2 = b2.getHolderName();
        System.out.println(name2);

    }
}
