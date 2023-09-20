package FunctionalInterface.Supplyer;

import java.util.*;
import java.util.function.Supplier;

public class SupplyerClass {
    public static void main(String[] args) {

        List list2= Arrays.asList(10,20,30);  //list2 is immutable
        Supplier<Integer> supplier=()->{
            return list2.size();
        };
        System.out.println(supplier.get());
    }
}
