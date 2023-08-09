package calculator;

public class Subtraction extends Calculate{
    @Override
    public double calculate(double... number) {
        double subtraction=0;
        for(double storeNumber:number){
            subtraction=subtraction-storeNumber;
        }
        return subtraction;
    }
}
