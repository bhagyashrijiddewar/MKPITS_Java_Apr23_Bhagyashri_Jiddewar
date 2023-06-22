public class CalculateService {
    double response;
    public double calculate(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                CalculateAddition addition = new CalculateAddition();
                response = addition.getCalculateValue(operand1, operand2);
                break;
            case "-":
                CalculateSubstraction substract = new CalculateSubstraction();
                response = substract.getCalculateValue(operand1, operand2);
                break;
            case "*":
                CalculateMultiplication multiply = new CalculateMultiplication();
                response = multiply.getCalculateValue(operand1, operand2);
                break;
            case "/":
                CalculateDivision division = new CalculateDivision();
                response = division.getCalculateValue(operand1, operand2);
                break;
            case "%":
                CalculateModulus modulus = new CalculateModulus();
                response = modulus.getCalculateValue(operand1, operand2);
                break;
        }
        return  response;
    }
}
