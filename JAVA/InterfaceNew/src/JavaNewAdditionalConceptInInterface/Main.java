package JavaNewAdditionalConceptInInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius");
        Circle circle=new Circle(scanner.nextInt());
        System.out.println(circle.calculateArea());
        System.out.println(circle.displayColor());
        Shape.displayBrandName();
        System.out.println(Circle.brandName);
    }
}
