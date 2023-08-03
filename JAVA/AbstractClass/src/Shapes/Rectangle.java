package Shapes;

public class Rectangle extends Shape {
    private double breadth;
    private double length;

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double calculateArea(){
     double area;
     area=length*breadth;
     return area;
    }

}
