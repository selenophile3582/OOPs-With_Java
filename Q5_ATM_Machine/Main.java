
public class Main {

    public static void main(String[] args) {

        ATM_Account acc = new ATM_Account("0000", 1000.0);   //Account Created ! 

        ATM_Account acc2 = new ATM_Account("halo", 0);  // please enter a 4 digit pin 

        ATM_Account acc3 = new ATM_Account("123", 100);    // please enter a 4 digit pin 

        ATM_Account acc4 = new ATM_Account("1234", -1);   

        acc.setPin("0000", "2222");  

        acc.setPin("1111", "222"); 
        // acc.setPin("0000");
        // acc.showBalance("1432");
        // acc.showBalance("0000");
        // acc.withdraw("0000", 3333);
        // acc.withdraw("0000", 21);
        // acc.withdraw("1432", 33);
        // acc.showBalance("0000");
    }

}
