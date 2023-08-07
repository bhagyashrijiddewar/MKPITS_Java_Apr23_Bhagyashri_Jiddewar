import Calculator.Addition;
import Calculator.CalculationServices;
import Calculator.Subtraction;
import Shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select the case number 1.Circle \n 2.Rectangle");
        ShapeServices shapeServices=new ShapeServices();
        shapeServices.selectOption(scanner.nextInt(),scanner.nextInt());

//        System.out.println("------------Area of circle-------------------");
//        System.out.println("Enter the radius");
//        AreaOfCircle areaOfCircle=new AreaOfCircle(scanner.nextInt());
//        double area=areaOfCircle.calculateArea();
//        System.out.println("Area of Circle = "+area);
//
////------------------Area of rectangle--------------------------
//        System.out.println("------------Area of rectangle-------------------");
//        System.out.println("Enter the length and breadth");
//        AreaOfRectangle areaOfRectangle=new AreaOfRectangle();
//        areaOfRectangle.setBreadth(scanner.nextDouble());
//        areaOfRectangle.setLength(scanner.nextDouble());
//        double areaRectangle=areaOfRectangle.calculateArea();
//        System.out.println("Area of Rectangle = "+areaRectangle)


        //-------------------------Calculator----------------------------
        System.out.print("Enter 1st Number = ");
        int number1=scanner.nextInt();

        System.out.print("Enter 2st Number = ");
        int number2=scanner.nextInt();

        System.out.println("Choose any one option :");
        System.out.println("1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");
        System.out.println("-------------------------------------");
        int option = scanner.nextInt();

        CalculationServices calculationServices=new CalculationServices();
        calculationServices.calculationSection(option,number1,number2);


//        System.out.println("----------Addition of two number-------------------");
//        System.out.println("Enter number1 and number2 : ");
//        Addition addition=new Addition();
//        System.out.println("Addition of two numbers = "+addition.calculate( scanner.nextInt(), scanner.nextInt()));
//
//
//        System.out.println("----------Subtraction of two number-------------------");
//        System.out.println("Enter number1 and number2 : ");
//        Subtraction subtraction=new Subtraction();
//        System.out.println("Subtraction of 2 numbers = "+subtraction.calculate(scanner.nextInt(),scanner.nextInt()));

    }
}