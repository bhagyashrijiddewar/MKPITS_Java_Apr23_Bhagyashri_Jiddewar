package FunctionalInterface.Consumer;

import java.util.LinkedList;
import java.util.function.Consumer;

public class ConsumerClass {
    public static void main(String[] args){

        LinkedList <Integer>linkedList=new LinkedList<Integer>();
        linkedList.add(25);
        linkedList.add(50);
        linkedList.add(80);
        Consumer consumer=
                (number)->{
            System.out.println(number);
        } ;
        linkedList.forEach(consumer);

    }
}
