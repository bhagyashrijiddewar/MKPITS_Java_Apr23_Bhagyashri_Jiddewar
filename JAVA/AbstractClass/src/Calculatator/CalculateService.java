package Calculatator;
public class CalculateService {
    public void getFinalCalculation(int option,int number1,int number2){
        // We can not create abstract class object/instanciate
        // we can use the concept of upcasting and down casting.
        // "c" is the reference for superclass
        Calculate c;
        switch (option){
            case 1:c =new Addition();
                int addition=c.getcalculate(number1,number2);
                System.out.println("Addition of 2 numbers = "+addition);
                break;
            case 2:c=new Substraction();
                int subtraction=c.getcalculate(number1,number2);
                System.out.println("Subtraction of 2 numbers = "+subtraction);
                break;
            case 3:c=new Multiplication();
                int multiplication=c.getcalculate(number1,number2);
                System.out.println("Multiplication of 2 numbers = "+multiplication);
                break;
            case 4:c=new Division();
                int division=c.getcalculate(number1,number2);
                System.out.println("Division of 2 numbers = "+division);
        }
    }
}
