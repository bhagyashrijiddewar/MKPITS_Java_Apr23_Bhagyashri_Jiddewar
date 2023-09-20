package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationAnonimousClass;

public class Main {
    public static void main(String[] args){

        new Addition(new Calcutation() {
            @Override
            public void calculate(int number1, int number2) {
                System.out.println(number1+number2);
            }
        });
    }
}
