package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListThread implements Runnable{
    List<Integer> list1=new ArrayList<Integer>();
    @Override
    public void run() {
        list1.add(25);
        list1.add(50);
    }
}
