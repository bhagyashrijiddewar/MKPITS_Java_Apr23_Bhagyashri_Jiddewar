public class CreditAccount {
    double balance=5000.25;
    private double creditAmount;

    public double credit(double creditAmount){
        balance = balance + creditAmount;
         return balance;
    }

}
