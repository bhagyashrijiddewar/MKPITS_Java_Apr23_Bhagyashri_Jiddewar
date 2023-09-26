package OddNumberByNonStaticMethod;

public class Main {
    public static void main(String[] args){
        PrintOddNumber printOddNumber=new PrintOddNumber();
        MyInterface myInterface=printOddNumber::displayOddNumber;
        myInterface.displayMethod();
    }
}
