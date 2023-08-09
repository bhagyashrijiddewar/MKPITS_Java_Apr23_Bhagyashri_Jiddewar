import calculator.Addition;
import calculator.Subtraction;
import varArgs.VariableArgumentClass;

public class Main {
    public static void main(String[] args) {
        System.out.println(VariableArgumentClass.displayAverage(25,56,12.3));
        Addition addition=new Addition();
        System.out.println(addition.calculate(12,53,52.6));
        Subtraction subtraction=new Subtraction();
        System.out.println(subtraction.calculate(12,56,23.5));
        System.out.println(System.getProperties());

    }
}