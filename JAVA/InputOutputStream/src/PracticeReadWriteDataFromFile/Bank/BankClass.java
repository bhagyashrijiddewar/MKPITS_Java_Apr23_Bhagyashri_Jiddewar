package PracticeReadWriteDataFromFile.Bank;

import java.io.Serializable;

public class BankClass implements Serializable {
    private String bankName="SBI";
    private String customerName;
    private String accountNumber;
    BankClass(String customerName,String accountNumber){
        this.customerName=customerName;
        this.accountNumber=accountNumber;
    }
    public String displayCustomerDetails(){
        return bankName+"\n"+customerName+"\n"+accountNumber;
    }

//    @Override
//    public String toString() {
//        return "BankClass{" +
//                "bankName='" + bankName + '\'' +
//                ", customerName='" + customerName + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                '}';
//    }

}
