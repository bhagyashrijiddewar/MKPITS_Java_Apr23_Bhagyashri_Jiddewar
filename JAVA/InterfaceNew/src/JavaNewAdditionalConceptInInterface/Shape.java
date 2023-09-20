package JavaNewAdditionalConceptInInterface;

public interface Shape {
    String color="blue";
    static String brandName="ABC";
    double calculateArea();
    default String displayColor(){
       return color;
    }
    static void displayBrandName(){
        System.out.println(brandName);
    }
}
