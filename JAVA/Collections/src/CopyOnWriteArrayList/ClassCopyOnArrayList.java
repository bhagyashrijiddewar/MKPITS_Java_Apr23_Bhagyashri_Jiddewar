package CopyOnWriteArrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClassCopyOnArrayList {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(25);
        list.add(70);
        list.add(60);
        CopyOnWriteArrayList copyOnWriteArrayList=new CopyOnWriteArrayList<Integer>(list);
        copyOnWriteArrayList.add(65);
        Iterator iterator=copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
