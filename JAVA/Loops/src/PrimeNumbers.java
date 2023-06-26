import java.util.Scanner;

public class PrimeNumbers {

    public void primeNumberChecked(){
        int number;int counter=0;
        int defaultValue=2;
        int remainder=0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number : ");
            number = scanner.nextInt();
            while (number > defaultValue) {
                if (number % 2 == 0) {
                    counter++;
                    break;
                }
                defaultValue++;
            }
            if (counter == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }while(counter!=0);
    }
}
