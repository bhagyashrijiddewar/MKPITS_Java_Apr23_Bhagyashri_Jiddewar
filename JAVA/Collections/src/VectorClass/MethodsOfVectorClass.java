package VectorClass;

import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Vector;

public class MethodsOfVectorClass {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        Vector vector=new Vector();
        vector.add(56);
        vector.add(80);
        vector.add(65);
        vector.add(50);
        vector.add(85);
        vector.add(69);
        vector.add(55);
        vector.add(88);
        vector.add(35);
        vector.add(50);

//        vector.add(56);
//        vector.add(80);
//        vector.add(65);
//        vector.add(50);
//        vector.add(85);
//        vector.add(69);
//        vector.add(55);
//        vector.add(88);

        System.out.println(vector.contains(56));
        System.out.println(vector.contains(55));
        System.out.println(vector.capacity());
        Object array[]=new Object[vector.size()];
        vector.copyInto(array);
        System.out.println("Display all the elements: ");
        for(Object obj:array){
            System.out.print(obj+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Clone method : "+vector.clone());
        vector.setSize(20);
        vector.set(2,44);
        System.out.println(vector);
        System.out.println("Display sublist : "+vector.subList(2,5));
//        Spliterator spliterator=vector.spliterator();
//
//        while (spliterator.hasCharacteristics(Spliterator.ORDERED)){
//            System.out.println(spliterator.characteristics());
//            break;
//        }
    }
}
