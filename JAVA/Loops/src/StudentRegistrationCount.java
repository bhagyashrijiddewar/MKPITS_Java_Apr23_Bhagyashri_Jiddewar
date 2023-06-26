public class StudentRegistrationCount {
    boolean isRegistration=true;
    int counter=0;
    public int registrationCount(){
        do{
            System.out.println("Your registration has been completed.");
            return counter++;
        }while (!isRegistration);
    }
}
