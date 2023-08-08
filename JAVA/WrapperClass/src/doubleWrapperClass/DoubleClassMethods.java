package doubleWrapperClass;

public class DoubleClassMethods {
    public void display(int number){
        Double value1=2.3;  // Object of Double class
        Double value2=2.3;  // Object of Double class
        System.out.println(""+Double.max(5,4));
        System.out.println("equals method compare the object not value ="+value1.equals(value2));
        System.out.println(""+Double.isFinite(value1));
        System.out.println(Double.isInfinite(value1));
    }
}
