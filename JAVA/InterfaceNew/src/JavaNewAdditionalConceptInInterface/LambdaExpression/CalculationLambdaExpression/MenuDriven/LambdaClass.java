package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression.MenuDriven;

import JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationAnonimousClass.Calcutation;

import java.util.Scanner;

public class LambdaClass {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Enter choice : \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        choice = scanner.nextInt();
        System.out.println("Enter two numbers :");
        int firstnumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

            switch (choice) {
                case 1:
                    Calcutation calcutation = (number1, number2) -> System.out.println(number1 + number2);
                    calcutation.calculate(firstnumber, secondNumber);
                    break;
                case 2:
                    Calcutation calcutation1 = (number1, number2) -> System.out.println(number1 - number2);
                    calcutation1.calculate(firstnumber, secondNumber);
                    break;
                case 3:
                    Calcutation calcutation2 = (number1, number2) -> System.out.println(number1 * number2);
                    calcutation2.calculate(firstnumber, secondNumber);
                    break;
                case 4:
                    Calcutation calcutation3 = (number1, number2) -> System.out.println(number1 / number2);
                    calcutation3.calculate(firstnumber, secondNumber);
                    break;
                default:
                    System.out.println("Invalid Expression.");
            }
        }
    }
}
