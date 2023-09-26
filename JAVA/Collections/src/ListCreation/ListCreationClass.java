package ListCreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListCreationClass {
    public static void main(String[] args){
//        --------------------------------------

        List list=new LinkedList();
        list.add(50);
        list.add(20);
        list.add(30);
//      list.forEach();
//        --------------------------------------

//        List list1=new ArrayList();
//        list1.add(20);
//        list1.add(30);
//        --------------------------------------

//        List list2= Arrays.asList(10,20,30);//list2 is immutable
//        list2.add(50);
//        System.out.println(list2);

//        --------------------------------------

        List list1=List.of(10,20,30);
        System.out.println(list1);
    }
}
