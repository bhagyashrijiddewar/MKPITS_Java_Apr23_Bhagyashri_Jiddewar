package OddNumberByStaticMethod;

public class Main {
    public static void main(String[] args) {
        NewInterface newInterface=PrintOddNumber::displayOddNumber;
        newInterface.dispMethod();
    }
}
