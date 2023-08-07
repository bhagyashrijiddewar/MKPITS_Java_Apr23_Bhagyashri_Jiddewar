import Calculatator.*;
import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Number = ");
        int number1=scanner.nextInt();

        System.out.print("Enter 2st Number = ");
        int number2=scanner.nextInt();

        System.out.println("Choose any one option :");
        System.out.println("1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");
        System.out.println("-------------------------------------");
        int option = scanner.nextInt();

        CalculateService calculateService=new CalculateService();
        calculateService.getFinalCalculation(option,number1,number2);
    }
}
