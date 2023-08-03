package Shapes;

public class Circle extends Shape{

        static double pi=3.14;
        private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
        public double calculateArea(){
            double area=pi*radius*radius;
            return area;
        }

    }


