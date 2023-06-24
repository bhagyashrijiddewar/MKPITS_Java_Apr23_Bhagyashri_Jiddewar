import java.util.Scanner;

public class PasswordDoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Username :");
        String username= scanner.nextLine();

        System.out.println("Enter the password :");
        int userPassword= scanner.nextInt();

        do{
            if(username=="abc" || userPassword==56){
                System.out.println("Login Successfully.");
                break;
            }
            else{
                System.out.println("Incorrect username or password.");
                break;
            }

        }while (username!="bhagyshri" && userPassword!=23);
    }

}
