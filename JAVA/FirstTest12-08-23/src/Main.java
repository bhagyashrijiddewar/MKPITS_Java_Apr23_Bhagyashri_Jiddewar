import Interface.TwoWheeler;
import NumberFormateAndStringIndexOutOfBound.StringClass;
import StringMismatch.StringMIsmatchClass;
import StringMismatch.StringMismatchException;
import employee.Contractor;
import employee.FullTimeEmployee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        ================================ StringMismatch ==============================================

        System.out.println("Enter two string :");
        StringMIsmatchClass stringMIsmatchClass=new StringMIsmatchClass(scanner.next(), scanner.next());
        try {
            System.out.println(stringMIsmatchClass.displayStringResult());
        }catch (StringMismatchException exception){
            System.out.println(exception);
        }
//        ================================ Interface ====================================================

        TwoWheeler twoWheeler=new TwoWheeler();
        twoWheeler.speed();
        twoWheeler.distance();
        twoWheeler.display();

//        ================================ Employee ========================================================

        System.out.println("Enter Employee name and salary :");
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(scanner.next(), scanner.nextDouble());
        System.out.println("Enter working hours for employee :");
        fullTimeEmployee.setEmployeeworkingHours(scanner.nextDouble());
        fullTimeEmployee.calculateSalary();

        System.out.println("Enter Contractor name and salary :");
        Contractor contractor=new Contractor(scanner.next(), scanner.nextDouble());
        System.out.println("Enter working hours for conterctor :");
        contractor.setWorkingHours(scanner.nextDouble());
        contractor.calculateSalary();

//        ================================ Number Formate Exception ================================================
        try {
            StringClass.display();
        }
        catch (NumberFormatException numberFormatException){
            System.out.println(numberFormatException);
        }
        try{
            StringClass.display_1();
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
            System.out.println(stringIndexOutOfBoundsException);
        }
    }
}