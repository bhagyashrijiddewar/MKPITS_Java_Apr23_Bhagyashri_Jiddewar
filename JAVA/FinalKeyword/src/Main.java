import InterestCalculation.InterestCalculationClass;
import StudentTeacher.Student;
import loanByConstructor.LoanClass;
import loanByUsingGetterSetter.Loan;
import loanByUsingObject.Lone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Student student=new Student();
        student.displayData();

        System.out.println("Enter loan amount = ");
        double loneAmount=scanner.nextDouble();
        System.out.println("Enter time duration = ");
        double time= scanner.nextDouble();
        System.out.println("Enter Account number = ");
        String accountNumber=scanner.next();
        System.out.println("=========== ******************** ==================");

        //-------------------By using Constructor-----------------
//        LoanClass loanClass=new LoanClass(accountNumber,loneAmount,time);
//
//        InterestCalculationClass interestCalculationClass=new InterestCalculationClass();
//        double interest= interestCalculationClass.calculateInterest(loanClass.getLoanAmount(),loanClass.getLoanDuration(),loanClass.getAccountNumber());
//        System.out.println("Calculate Interest = "+interest);

        //-------------------By using getter-Setter-----------------
//        Loan loan=new Loan();
//        loan.setAccountNumber(accountNumber);
//        loan.setLoanAmount(loneAmount);
//        loan.setDuration(time);
//
//        InterestCalculationClass interestCalculationClass=new InterestCalculationClass();
//        double interest= interestCalculationClass.calculateInterest(loan.getLoanAmount(),loan.getDuration(),loan.getAccountNumber());
//        System.out.println("Calculate Interest = "+interest);

        //-------------------By using objects we can get the information-----------------
        Lone lone=new Lone(accountNumber,loneAmount,time);
        InterestCalculationClass interestCalculationClass=new InterestCalculationClass();
        double interest= interestCalculationClass.calculateInterest(lone);
        System.out.println("Calculate Interest = "+interest);

    }
}