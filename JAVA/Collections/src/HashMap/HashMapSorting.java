package HashMap;

import java.util.*;

public class HashMapSorting {
    public static void main(String[] args){
        HashMap hashMap=new HashMap();
        hashMap.put(77,20);
        hashMap.put(20,30);
        hashMap.put(5,40);
        hashMap.put(35,50);
        hashMap.put(11,55);
        hashMap.put(40,500);
        hashMap.put(47,200);
        System.out.println("Unsorted map : "+hashMap+"\n");

        TreeMap treeMap=new TreeMap<>(hashMap);  //TreeMap is sorted on keys
        System.out.println("Sorted Map   : "+treeMap);

//        Set set=hashMap.entrySet();
//        Iterator iterator= set.iterator();
//        System.out.println("By using hashmap iterator : ");
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }
//        System.out.println();

        Set set1= treeMap.entrySet(); //If we want to display key-values at a time by using iterator that time we need to use entrySet()
        Iterator iterator1= set1.iterator();
        System.out.println("By using treeMap iterator : ");
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(
                set1);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> object1,
                               Map.Entry<Integer, Integer> object2) {
                return object1.getValue().compareTo(object2.getValue());
            }
        });
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
