package Shapes;

public class ShapeServices {
public void selectOption(int option,int radius){
    Shape shape;
    double result;
    switch (option){
        case 1:shape=new AreaOfCircle(radius);
               result=shape.calculateArea();
               System.out.println(result);
               break;
        case 2:shape=new AreaOfRectangle();
               result=shape.calculateArea();
               System.out.println(result);
               break;
        default:
            System.out.println("Invalid data.");

    }
}


}
