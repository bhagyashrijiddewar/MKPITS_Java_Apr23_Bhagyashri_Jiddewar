package ListIterator;

import java.util.*;

public class LIstIteratorClass {
    public static void main(String[] args) {
//        ----------------------------  Iterator ----------------------------------------
        List<Integer> newList = new ArrayList();
        newList.add(25);
        newList.add(99);
        newList.add(92);
        Iterator iterator = newList.iterator();
        System.out.println("Using iterator --> ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

//    --------------------------------- List Iterator------------------------------------------

        //---------------------------------Array List----------------------------------------------------------
        List<Integer> newList1 = new ArrayList();
        newList1.add(25);
        newList1.add(99);
        newList1.add(92);
        ListIterator listIterator=newList1.listIterator();
        System.out.println("---------------Next-----------------------");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println("------------ Previous -----------------");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
        //--------------------------------------Link List-------------------------------------------------------
        List<String> linkList = new LinkedList<>();
        linkList.add("25");
        linkList.add("99");
        linkList.add("92");
        ListIterator listIterator1=linkList.listIterator();
        System.out.println("---------------Next-----------------------");
        while (listIterator1.hasNext()){
            System.out.print(listIterator1.next()+" ");
        }
        System.out.println();
        System.out.println("------------ Previous -----------------");
        while (listIterator1.hasPrevious()){
            System.out.print(listIterator1.previous()+" ");
        }
    }
}