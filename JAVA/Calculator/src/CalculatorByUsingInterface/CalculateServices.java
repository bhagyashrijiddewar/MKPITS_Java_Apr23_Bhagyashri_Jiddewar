package CalculatorByUsingInterface;

public class CalculateServices {
    public double calculate(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                CalculateAddition calculateAddition = new CalculateAddition();
                double addition = calculateAddition.getCalculateValue(operand1, operand2);
                return addition;

            case "-":
                CalculateSubstraction substract = new CalculateSubstraction();
                double substraction = substract.getCalculateValue(operand1, operand2);
                return substraction;

            case "*":
                CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
                double multiplication = calculateMultiplication.getCalculateValue(operand1, operand2);
                return multiplication;

            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
                double division = calculateDivision.getCalculateValue(operand1, operand2);
                return division;

            case "%":
                CalculateModulus calculateModulus = new CalculateModulus();
                double modulus = calculateModulus.getCalculateValue(operand1, operand2);
                return modulus;

        }
        return  0;
    }
}
