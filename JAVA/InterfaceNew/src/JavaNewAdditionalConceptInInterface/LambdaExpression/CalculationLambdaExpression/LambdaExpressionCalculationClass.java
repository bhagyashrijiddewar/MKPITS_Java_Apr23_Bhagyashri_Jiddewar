package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression;

import JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationAnonimousClass.Calcutation;

public class LambdaExpressionCalculationClass {
    public static void main(String[] args){
           Calculation1 calculation1=()-> System.out.println("Hello java");
           calculation1.calculate();
    }
}
