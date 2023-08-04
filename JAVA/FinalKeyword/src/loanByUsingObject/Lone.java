package loanByUsingObject;

import loanByUsingGetterSetter.Loan;

public class Lone {
    private String accountNumber;
    private double loanAmount;
    private double duration;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getDuration() {
        return duration;
    }

    public Lone(String accountNumber, double loanAmount, double duration) {
        this.accountNumber = accountNumber;
        this.loanAmount = loanAmount;
        this.duration = duration;
    }
}
