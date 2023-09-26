package HashSetClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HAshSetClass {
    public static void main(String[] args){
        HashSet hashSet=new HashSet();
        hashSet.add(50);
        hashSet.add(40);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);
        System.out.println(hashSet.contains(40));
        System.out.println(hashSet.size());
        hashSet.remove(40);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.clone());
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        int []array=new int[hashSet.size()];
        for(Integer integer:array) {
            System.out.print(integer+" ");
        }
    }
}
