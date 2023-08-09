package varArgs;

public class VariableArgumentClass {
    public static double displayAverage(double...number){
        double average=0;
        for(double numberVariable:number){
            average=average+numberVariable;
        }
        return average;
    }

}
