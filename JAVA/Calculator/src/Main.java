
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num=10;
         while(num==10) {
             Scanner scanner1=new Scanner(System.in);
             System.out.println("Enter first number : ");
             double operand1=scanner1.nextDouble();

             System.out.println("Enter Second number : ");
             double operand2=scanner1.nextDouble();

             //Scanner scanner=new Scanner(System.in);
             System.out.println("Enter the operator + or - or * or / or %");
             String operator = scanner1.next();
             System.out.print(""+operand1+" "+operator+" "+operand2+" = ");

             CalculateService service = new CalculateService();
             System.out.println(service.calculate(operator, operand1, operand2));
             System.out.println("----------------------------------------------------");

         }
    }
}