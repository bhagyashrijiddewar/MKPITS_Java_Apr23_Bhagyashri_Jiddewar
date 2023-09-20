package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression.PrintOddEven;

public class PrintOddEvenNumberByAnonimousClass {
    public static void main(String[] args){
        Runnable runnableEven=new Runnable() {
            @Override
            public void run() {
                System.out.println("Even number is: ");
                for(int number=1;number<=100;number++){
                    if (number % 2 == 0) {
                        System.out.print(number+" ");
                    }
                }
            }
        };
        Runnable runnableOdd=new Runnable() {
            @Override
            public void run() {
                System.out.println("Odd number is :");
                for(int number=1;number<=100;number++){
                    if(number%2==1){
                        System.out.print(number+" ");
                    }
                }
            }
        };
        runnableEven.run();
        System.out.println();
        runnableOdd.run();
    }
}
