
public class Investor {

    private String name;
    private int investment;

    public Investor() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvestment(int investment) {
        if (investment > 0) {
            this.investment = investment;
        }
    }

    //display property 
    public void displayInvInfo() {
        System.out.println("Name : " + name);
        System.out.println("Investment : " + investment);
    }

}
