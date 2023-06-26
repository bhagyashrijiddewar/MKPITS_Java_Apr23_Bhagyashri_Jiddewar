import java.util.Scanner;

public class TravelByOwnDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Speed: ");
        int speed = scanner.nextInt();
        System.out.println("Enter the time: ");
        int time = scanner.nextInt();
        int distance = 0;

            do{
                distance = time * speed;
                System.out.println("Total time : " + distance);
                //break;
            } while (time != 10 && speed != 50);
        }
    }

