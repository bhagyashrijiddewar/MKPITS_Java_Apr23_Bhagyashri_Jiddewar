public class Collage {
//    private static int collageFees=100; //1. Static variable
    private static int collageFees; //7. Static variable

    private int amount; //2.non-static variable


//// 1. non-static method can access static and non-static variable
//      public  void display(){
//       System.out.println(collageFees);
//    }
//  -----------------------------------------------------------------------------
//    //2. Static method can access only static variables
//    public static void display(){
//        System.out.println(collageFees);
////        System.out.println(amount); // because of non-static variable this shows an error
//    }

//----------------------------------------------------------------------------------
//    //3.If we want to access non-static variables we can use
//    public static void display(){
//        Collage collage=new Collage();
//
//        System.out.println(collageFees);
//        System.out.println(collage.amount); // By reference of object of that class
//    }
//------------------------------------------------------------------------------------
//    //4. If there is 2 method in same class, 1st is static and 2nd is non-static in that case
//    //   we need to craete an object of that class to access non-static method.
//    public void display(){
//        System.out.println(collageFees);
//    }
//    public static void main(String[] args){
//        Collage collage=new Collage();
//        collage.display();
//    }

    //5. If there are 2 method in same class, both are static in that case
    //   we does not need to craete an object of that class we directly access static method.
//    public static void display(){
//        System.out.println(collageFees);
//    }
//    public static void main(String[] args){
//        Collage.display();
//    }

    //6. If there are 2 method in different classes, both are static in that case
    //   we does not need to craete an object of that class we directly access static method.
//    public static void display(){
//        System.out.println(collageFees);
//    }

//    //7. If we want to initialize the value in the constructor it can not be initialize the value.
//    //   if we want to initialize the value to the variable we can use the (Static block).
//    public Collage(){
//        collageFees=500;
//    }
//    public static void display(){
//        System.out.println(collageFees);
//    }

    //8. If we want to initialize the value in the constructor it can not be initialize the value.
    //   if we want to initialize the value to the variable we can use the (Static block) .
    static{
        collageFees=500;
    }
    public static void display(){
        System.out.println(collageFees);
    }
}
