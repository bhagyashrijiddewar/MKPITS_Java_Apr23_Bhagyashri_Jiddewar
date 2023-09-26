package PracticeReadWriteDataFromFile.Bank;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BankClass bankClass=new BankClass("Bhagyashri","SBIN12345");
        ReadWriteObjectDataOnFile.WriteDataOnObject(bankClass);
//        ----------------------------(1)----------------------------
//        ReadWriteObjectDataOnFile.readDataFromObject(bankClass);
//        ----------------------------(2)----------------------------
//       bankClass=(BankClass) ReadWriteObjectDataOnFile.readDataFromObject();
//        System.out.println(bankClass.displayCustomerDetails());
//        ----------------------------(3)----------------------------
        bankClass=(BankClass) ReadWriteObjectDataOnFile.readDataFromObject(bankClass);
        System.out.println(bankClass.displayCustomerDetails());
    }
}
