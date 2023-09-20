package JavaNewAdditionalConceptInInterface;

public class Circle implements Shape{
    private int radius;
    final static double pi=3.14;

    public Circle(int radius) {
        this.radius = radius;

    }
    @Override
    public double calculateArea() {
        double areaOfCircle;
        areaOfCircle=pi*radius*radius;
        return areaOfCircle;
    }
    @Override
    public String displayColor() {
        String string= Shape.super.displayColor();
        return string;
    }

}
