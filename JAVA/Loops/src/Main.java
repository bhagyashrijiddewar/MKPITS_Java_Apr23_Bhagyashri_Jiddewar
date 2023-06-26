public class Main {
    public static void main(String[] args) {
        //-------------------Password Program by using Do While Loop-----------------------------

        PasswordDoWhileLoop passwordDoWhileLoop=new PasswordDoWhileLoop();
        passwordDoWhileLoop.password();

        //------------------Student Registration Count-------------------------------------------
        StudentRegistrationCount studentRegistrationCount=new StudentRegistrationCount();
        System.out.println("Total number of student registered = "+studentRegistrationCount.registrationCount());

        //-------------------Password Program by using While Loop-----------------------------
        PasswordWhileLoop passwordWhileLoop=new PasswordWhileLoop();
        passwordWhileLoop.passwordChecked();

        //------------------Student Result-------------------------------------------
        StudentResult studentResult=new StudentResult();
        studentResult.student();


    }
}