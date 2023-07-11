import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num=8;
        while (num!=0) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the case number below :---\n1:Inverted Triangle\n2.Merge RightAngle\n3.Merge Triangle\n4.Star RightAngle\n5.Star Reverse RightAngle\n6.Star Triangle\n7.Merge InvertedTriangles\n8.Merge Number Design\nEnter here :");
            int pattern = scanner.nextInt();
            System.out.println("Enter the number for star print Design : ");
            int number = scanner.nextInt();

            ServiceStarPattern serviceStarPattern = new ServiceStarPattern();
            serviceStarPattern.serviceStarPattern(pattern, number);
            System.out.println("------------------------------------------------------------");
        }
    }
}
