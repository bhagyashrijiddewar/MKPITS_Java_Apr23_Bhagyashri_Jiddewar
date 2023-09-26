package LinkList;

import java.util.LinkedList;
import java.lang.Integer;
import java.util.*;

public class UseMethodsOfLinkList {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(50);
        list.add("Pranay");
        list.add(65.35);

        List <Integer>  list1=new LinkedList();
        list1.add(56);
        list1.add(50);
        list1.add(55);

//        ---------------------------------------------------------------------
        System.out.println("Print list by passing object :"+list);
//        ----------------------------------------------------------------------
        System.out.println("Print list by using for loop :");
        for(int initialValue=0;initialValue<list.size();initialValue++){
            System.out.print(list.get(initialValue)+" ");
        }
        System.out.println();
//        --------------------------------------------------------------------
        System.out.println("Print list by passing object in foreach loop :");
        for(Object value:list){
            System.out.print(value+" ");
        }
        System.out.println();
//        --------------------------------------------------------------------
        System.out.println("Print Linked list by using iterator :");
        Iterator iterator= list.iterator();
           while(iterator.hasNext()){
               System.out.print(iterator.next()+" ");
           }
        System.out.println();
//      ----------------------------------------------------------------------
        System.out.println("Print list by passing Integer class name in foreach loop :");
        for(Integer value:list1){
            System.out.print(value+" ");
        }
        System.out.println();
//        --------------------------------------------------------------------
        System.out.println("By passing the list as an argument to the linklist : ");
        List list2=new LinkedList(list);
        list2.add("Shubham");
        System.out.println(list2);
//        ----------------------------------------------------------------------
        System.out.println("If we want to use addFirst method to an existing list that time we need " +
                "to call the paramererized constructor of collection parameter :");
        LinkedList linkedList=new LinkedList(list2);
        linkedList.add(26);
        linkedList.add(50);
        linkedList.add(28);
        linkedList.addFirst(90);
        linkedList.addLast("Math");
        System.out.println(linkedList);
//        -----------------------------------------------------------------------
       LinkedList linkedList1= (LinkedList) linkedList.clone(); //We typecast the LinkList becz it returns the object of object class.
        System.out.println(linkedList1);
//        ------------------------------------------------------------------------
        LinkedList linkedList2=new LinkedList();
        linkedList2.addAll(list);
        System.out.println("After adding the list collection with the help of addAll() :"+linkedList2);
        linkedList2.offer(35);
        System.out.println("After applying offer() : "+linkedList2);
        System.out.println("Get first value of list :"+linkedList2.getFirst());
        System.out.println("Get last value of list :"+linkedList2.getLast());
        System.out.println("Index of the entered element : "+linkedList2.indexOf(35));
        System.out.println(linkedList2);
        System.out.println(linkedList2.remove(2));
        System.out.println(linkedList2);

//        ------------------------------------------------------------------------
        LinkedList linkedList3=new LinkedList();
        linkedList3.add(25);
        linkedList3.add(36);
        linkedList3.add(94);
        linkedList3.poll();
        System.out.println("After using poll() method, 1st in 1st out concept of "+linkedList3);
//        ------------------------------------------------------------------------

        }
    }

