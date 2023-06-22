import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num=10;
         while(num==10) {
//             System.out.println("Enter first number : ");
//             Scanner scanner1=new Scanner(System.in);
//             String operand=scanner1.nextLine();
//
//             System.out.println("Enter Second number : ");
//             Scanner scanner2=new Scanner(System.in);
//             String operand2=scanner2.nextLine();

             System.out.println("Enter the opertator + or - or * or / or %");
             Scanner scanner = new Scanner(System.in);
             String operator = scanner.nextLine();

             CalculateService service = new CalculateService();
             System.out.println("Operator = " + operator);
             System.out.println("Value after operation = " + service.calculate(operator, 12.3,  90.7));

            //  System.out.println("Value after operation = " + service.calculate(operator,operand,  operand2));

         }
    }
}