package HashSetClass;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertArrayToList {
    public static void main(String[] args){
        Integer[] numArray1={56,25,80,45};
        Integer[] numArray2={23,56,46,89};
        HashSet <Integer> hashSet=new HashSet<Integer>(Arrays.asList(numArray1));
        HashSet <Integer> hashSet1=new HashSet<Integer>(Arrays.asList(numArray2));
        hashSet.retainAll(hashSet1);
        System.out.println(hashSet);
        hashSet.addAll(hashSet1);
        System.out.println(hashSet);
        hashSet.remove(hashSet1);
        System.out.println(hashSet);

    }
}
