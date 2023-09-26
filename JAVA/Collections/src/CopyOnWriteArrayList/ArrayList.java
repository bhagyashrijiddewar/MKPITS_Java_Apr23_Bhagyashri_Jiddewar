package CopyOnWriteArrayList;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args){
        ArrayListThread arrayListThread=new ArrayListThread();
        Thread thread=new Thread(arrayListThread);
        thread.start();

        arrayListThread.list1.add(90);
        arrayListThread.list1.add(80);
        arrayListThread.list1.add(88);
        Iterator iterator=arrayListThread.list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
