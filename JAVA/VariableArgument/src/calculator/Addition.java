package calculator;

public class Addition extends Calculate{
    @Override
    public double calculate(double... number) {
        double addition=0;
        for(double storeNumber:number){
            addition=addition+storeNumber;
        }
        return addition;
    }
}
