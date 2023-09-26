package CopyOnWriteArrayList;

import java.util.Iterator;

public class ThreadCopyOnWriteArrayList {
    public static void main(String[] args){
        ThreadClass threadClass=new ThreadClass();
        Thread thread=new Thread(threadClass);

        threadClass.copyOnWriteArrayList.add(90);
        threadClass.copyOnWriteArrayList.add(92);
        threadClass.copyOnWriteArrayList.add(99);
        thread.start();
        Iterator iterator=threadClass.copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(threadClass.copyOnWriteArrayList);
    }
}
