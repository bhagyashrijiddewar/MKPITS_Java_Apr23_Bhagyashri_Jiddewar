package PracticeReadWriteDataFromFile.Bank;

import java.io.*;

public class ReadWriteObjectDataOnFile {
    public static void WriteDataOnObject(BankClass bankClass){
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("bank.txt"));
            objectOutputStream.writeObject(bankClass);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    ---------------------------------------------------------------------------
//    public static void readDataFromObject(BankClass bankClass) throws IOException, ClassNotFoundException {
//        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("bank.txt"));
//        bankClass=(BankClass)objectInputStream.readObject();
//        System.out.println(bankClass.displayCustomerDetails());
//    }
//    --------------------------------------------------------------------------
//public static Object readDataFromObject() throws IOException, ClassNotFoundException {
//    ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("bank.txt"));
//   return objectInputStream.readObject();
//}
//    --------------------------------------------------------------------------
public static BankClass readDataFromObject(BankClass bankClass) throws IOException, ClassNotFoundException {
    ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("bank.txt"));
    bankClass=(BankClass)objectInputStream.readObject();
    return bankClass;
}
}
