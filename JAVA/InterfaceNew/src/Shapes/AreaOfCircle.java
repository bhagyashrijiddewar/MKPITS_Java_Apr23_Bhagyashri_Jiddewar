package Shapes;

public class AreaOfCircle implements Shape{
    private int radius;
    final static double pi=3.14;

    public AreaOfCircle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        double areaOfCircle;
        areaOfCircle=pi*radius*radius;
        return areaOfCircle;
    }
}
