import Shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Shape s;
        System.out.println("Enter the Radius :");
        int radius=scanner.nextInt();

        Circle circle=new Circle();
        circle.setRadius(radius);
        double areaOfCircle=circle.calculateArea();
        System.out.println("Area of circle = "+areaOfCircle);

        Rectangle rectangle=new Rectangle();
        System.out.println("Enter the length = ");
        double length=scanner.nextDouble();
        System.out.println("Enter the breadth = ");
        double breadth=scanner.nextDouble();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);
        double areaOfRectangle=rectangle.calculateArea();
        System.out.println("Area of rectangle = "+areaOfRectangle);

    }
}