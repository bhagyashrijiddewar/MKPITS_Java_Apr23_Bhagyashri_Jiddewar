package password;

public class PasswordProgram {
    private final String password1="12345";

    public void checkPassword(String password){
        if (password1.equals(password)) {

            System.out.println("Correct password.");
        }
        else{
            System.out.println("Invalid Password.");
        }
    }
}
