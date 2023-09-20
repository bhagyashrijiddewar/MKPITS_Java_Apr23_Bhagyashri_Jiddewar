package JavaNewAdditionalConceptInInterface.LambdaExpression.CalculationLambdaExpression.ForEachMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ForEachMethodOfLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(12,25,65,40,27,84,95));
        System.out.println("Display Arraylist : ");
        System.out.println(arrayList);
        System.out.println("----------------------------------------");
        Iterator iterator =arrayList.iterator();
        System.out.println("Print arrayList by using iterator : ");
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Print Even values of arrayList : ");

        arrayList.forEach((number)->{
            if(number%2==0)
                System.out.print(number+" ");
        });
    }
}
