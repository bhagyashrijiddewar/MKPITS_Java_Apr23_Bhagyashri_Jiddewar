package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression.Addition;

import JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationAnonimousClass.Calcutation;

public class Main {
    public static void main(String[] args){
        Calcutation calcutation=(a,b)->{
            System.out.println(a+b);
        };
         new Addition(calcutation);
    }
}
