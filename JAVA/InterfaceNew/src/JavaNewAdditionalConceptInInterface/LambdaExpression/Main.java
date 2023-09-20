package JavaNewAdditionalConceptInInterface.LambdaExpression;

public class Main {
    interface Shape{
        void calculateArea(int length,int bredth);
    }

    public static void main(String[] args){

        Shape shape=(length,bredth)-> System.out.println("Area of rectangle = "+(length*bredth));
        shape.calculateArea(10,5);
    }
}
