package precidenceOperator;

import org.w3c.dom.ls.LSOutput;

public class DataPrecedence {
    private static int i=5;
    private static  int j=++i;
    private static int k=i++;
    public static void display(){
        System.out.println(" i = "+i);
        System.out.println(" j = "+j);
        System.out.println(" K= "+k);
    }
}
