import java.util.Scanner;

public class ATMWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter withdraw amount :");
        long amountWithdraw = scanner.nextLong();

        long totalBalance=500000;

        do {
            if (amountWithdraw > 500) {
                System.out.println("Enter pin number :");
                int pinNumber = scanner.nextInt();

                if (pinNumber == 12345) {
                    totalBalance=totalBalance-amountWithdraw;
                    System.out.println(" Your transaction has been successfully done. ");
                    System.out.println("Total Balance = "+totalBalance);
                } else {
                    System.out.println("Incorrect pin, please enter correct pin.");
                }
                break;
            }
            else {
                System.out.println("The enter amount should be multiple of Rs.500 , Rs.1000");
            }
            break;
        }while (amountWithdraw<500000);

    }
}
