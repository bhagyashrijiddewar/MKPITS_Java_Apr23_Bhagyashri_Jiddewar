package InterestCalculation;

import loanByUsingObject.Lone;

public final class InterestCalculationClass {
    private final int rateOfInterest;
    //    private int time;

//    public final double calculateInterest(double loneAmount,double time,String accountNumber){
//        System.out.println("Account number is " + accountNumber);
//        return  ( loneAmount * (1 + rateOfInterest * time));
//    }
public final double calculateInterest(Lone lone){
    System.out.println("Account number is "+lone.getAccountNumber() );
       return  ( lone.getLoanAmount() * (1 + rateOfInterest * lone.getDuration()));
}
   public InterestCalculationClass(){
        rateOfInterest=10;
    }
}
