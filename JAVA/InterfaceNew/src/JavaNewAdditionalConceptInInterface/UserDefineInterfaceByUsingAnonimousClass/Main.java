package JavaNewAdditionalConceptInInterface.UserDefineInterfaceByUsingAnonimousClass;

interface Shape{
     void calArea();
}
class  Circle{
    Circle(Shape shape){
        shape.calArea();
        }
 }
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Shape() {
            @Override
            public void calArea() {
                System.out.println("Hello");
            }
        });
    }
}

