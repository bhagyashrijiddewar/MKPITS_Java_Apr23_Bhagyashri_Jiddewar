public class Volume {
    public double volume(int side){
        return (side*side*side);
    }
    public double volume(double radius){
        double pie=3.14;
        return 4/3*pie*(radius*radius*radius);

    }
}
