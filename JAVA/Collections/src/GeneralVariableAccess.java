public class GeneralVariableAccess {
   static int marks=10;
   static String name="Shiv";
   private void display(){
       System.out.println(marks);
       System.out.println(name);
   }
   private void display(int number){
       System.out.println(number);
       System.out.println(name);
   }
    public void display(int number,int number1){
        System.out.println(number);
        System.out.println(name);
    }
    public static void main(String [] args){
//        The variable must be static becoz method is static
//        System.out.println(marks);
//        System.out.println(name);
        GeneralVariableAccess generalVariableAccess=new GeneralVariableAccess();
        generalVariableAccess.display();
        generalVariableAccess.display(15);



    }
}
