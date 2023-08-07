package Shapes;

public class AreaOfRectangle  implements Shape{

    private double length;
    private double breadth;

    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        double area;
        area=length*breadth;
        return area;
    }
}
