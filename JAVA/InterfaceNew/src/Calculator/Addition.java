package Calculator;

public class Addition implements Calculate {
    @Override
    public int calculate(int number1, int number2) {
        return number1 + number2;
    }
}
