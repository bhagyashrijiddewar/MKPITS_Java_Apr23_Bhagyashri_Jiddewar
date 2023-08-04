package StudentTeacher;

//public final class Teacher {
    public  class Teacher {

        private int number;
// 1. private final int number;
   public void displayData(){ //Concreate method
// public final void displayData(){ //Concreate method

           number=200; //1. (Error bcz of final variable)
         System.out.println(number);
     }
     Teacher(){  // Default constructor
         number=100;
     }
}
