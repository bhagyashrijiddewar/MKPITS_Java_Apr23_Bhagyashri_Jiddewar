package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression.PrintOddEven;

public class PrintOddEvenByLambdaExpression {
    public static void main(String[] args) {
       Runnable runnableEven=()-> {
           System.out.println("Even number is: ");
           for(int number=1;number<=100;number++){
               if (number % 2 == 0) {
                   System.out.print(number+" ");
               }
           }
       };
        runnableEven.run();
        System.out.println();
        Runnable runnableOdd=()-> {
            System.out.println("Odd number is: ");
            for(int number=1;number<=100;number++){
                if (number % 2 == 1) {
                    System.out.print(number+" ");
                }
            }
        };
        runnableOdd.run();
    }
}
