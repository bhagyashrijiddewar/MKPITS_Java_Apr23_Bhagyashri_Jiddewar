import java.util.Scanner;
public class PasswordWhileLoop {
   public void passwordChecked() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Username :");
        String username = scanner.nextLine();

        System.out.println("Enter the password :");
        int userPassword = scanner.nextInt();

        while (username != null && userPassword != 0) {

            if (username.equals("abc") && userPassword == 12345) {
                System.out.println("Login successfully.");
            }
            else{
                System.out.println("Incorrect login credentials.");
            }
            break;
        }

    }
}
