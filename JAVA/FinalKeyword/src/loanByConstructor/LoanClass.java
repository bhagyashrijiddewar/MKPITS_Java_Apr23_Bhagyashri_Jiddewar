package loanByConstructor;

public class LoanClass  {
    private String accountNumber;
    private double loanAmount;
    private  double loanDuration;

   public LoanClass(){

    }

    public LoanClass(String accountNumber, double loanAmount, double loanDuration) {
        this.accountNumber = accountNumber;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getLoanDuration() {
        return loanDuration;
    }
}
