import java.util.Scanner;

public class TravelByOwnWhileLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Speed: ");
        int speed=scanner.nextInt();
        System.out.println("Enter the time: ");
        int time=scanner.nextInt();
        int distance=0;

        while(time!=0 && speed!=0){
            distance=time * speed;
            System.out.println("Total time : "+distance);
            break;
        }
    }
}
