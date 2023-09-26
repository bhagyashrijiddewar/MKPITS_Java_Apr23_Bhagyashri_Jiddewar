package CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadClass implements Runnable{
    CopyOnWriteArrayList copyOnWriteArrayList=new CopyOnWriteArrayList<Integer>();

    @Override
    public void run() {
        copyOnWriteArrayList.add(25);
        copyOnWriteArrayList.add(50);
    }
}
