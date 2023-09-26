package HashMap;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args){
        HashMap hashMap=new HashMap();
        hashMap.put(11,"Pranay");
        hashMap.put(12,"Abhi");
        hashMap.put(13,"Shubham");
        System.out.println("All key valur pair :"+hashMap);

        hashMap.put(10,"bhagyashri");
        System.out.println("Get value by key : "+hashMap.get(12));

        System.out.println("Size of an element : "+hashMap.size());

        System.out.println("Entry set : "+hashMap.entrySet());

        System.out.println("Key set : "+ hashMap.keySet());

        System.out.println(hashMap.values());

        System.out.println(hashMap.clone());

        System.out.println(hashMap.isEmpty());

        HashMap hashMap1=new HashMap();
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1.keySet());

//        System.out.println(hashMap1.merge(hashMap.keySet(),hashMap.values(),));
        System.out.println(hashMap);

        System.out.println(hashMap1.replace(10,"Krish"));
        System.out.println(hashMap1);

        System.out.println(hashMap1.containsKey(10));

        System.out.println(hashMap1.remove(10,"Krish"));

        System.out.println(hashMap1.containsValue("Krish"));

        System.out.println(hashMap1.getOrDefault(12,"Trupti"));

        System.out.println(hashMap1.getOrDefault(20,"Trupti"));


    }

}
