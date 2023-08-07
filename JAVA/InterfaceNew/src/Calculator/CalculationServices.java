package Calculator;

public class CalculationServices {

    public void calculationSection(int choice,int number1,int numbner2){
        double result;
        Calculate calculate;
        switch (choice){
            case 1:calculate=new Addition();
                  result= calculate.calculate(number1,numbner2);
                  System.out.println(result);
                  break;
            case 2:
                  calculate=new Subtraction();
                  result= calculate.calculate(number1,numbner2);
                  System.out.println(result);
                  break;

            case 3:
                calculate=new Multiplication();
                result= calculate.calculate(number1,numbner2);
                System.out.println(result);
                break;

            case 4:
                calculate=new Division();
                result= calculate.calculate(number1,numbner2);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid data.");

        }
    }
}
