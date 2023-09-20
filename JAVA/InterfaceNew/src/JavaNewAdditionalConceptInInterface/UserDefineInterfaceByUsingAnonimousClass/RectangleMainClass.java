package JavaNewAdditionalConceptInInterface.UserDefineInterfaceByUsingAnonimousClass;

interface Shape1{
    void calculateArea(int length,int bredth);
}
class Rectangle{
    Rectangle(){
      Shape1 shape= (length,bredth)-> System.out.println(length*bredth);
       shape.calculateArea(20,50);
    }
}
public class RectangleMainClass {
    public static void main(String[] args){
        new Rectangle();
    }
}
