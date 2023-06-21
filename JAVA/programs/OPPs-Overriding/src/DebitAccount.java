public class DebitAccount extends CreditAccount {
    private double debitAccount;
    public double credit(double debitAccount){
        balance = balance - debitAccount;
        return balance;
    }
}
