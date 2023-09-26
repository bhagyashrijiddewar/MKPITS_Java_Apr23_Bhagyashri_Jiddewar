package ArrayList;

import java.util.*;

public class UseMethodsOfArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bhagyashri");
        list.add("Math");
        list.add(94);
        System.out.println("Complete list display : "+list);
//-----------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        System.out.println("Using for loop-->Individual list data :");
        for(int number=0;number<list.size();number++){
            System.out.println(list.get(number));
        }
//-----------------------------------------------------------------------
        System.out.println("-------------------------------------------------");
        list.add(1,"Jiddewar");
        System.out.println("Using for loop -->Individual list data by adding value at 1st index :");
        for(int number=0;number<list.size();number++){
            System.out.print(list.get(number)+" ");
        }
        System.out.println();
        //-------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------");
        List <Integer> listInt=new ArrayList();
        listInt.add(25);
        listInt.add(65);
        listInt.add(90);
        listInt.add(1,38);
        System.out.println("Using foreach loop --> If the object of arraylist is specific class like" +
                " Integer/Double (wrapper classes) that time we can use foreach loop :");
        for(Integer value:listInt){
            System.out.print(value+" ");
        }
        System.out.println();
//        ----------------------------------------------------------------------
        System.out.println("------------------------------------------------------------------------------");
        List <Integer> newList=new ArrayList();
        newList.add(25);
        newList.add(60);
        newList.add(92);
        Iterator iterator=newList.iterator();
        System.out.println("Using iterator --> ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
//        ---------------------------------------------------------------------
        System.out.println("Contains method : "+newList.contains(60));
//        ---------------------------------------------------------------------
        System.out.println(newList.remove(2));
        System.out.println("After remove the 2nd index value the list is :"+newList);


    }
}