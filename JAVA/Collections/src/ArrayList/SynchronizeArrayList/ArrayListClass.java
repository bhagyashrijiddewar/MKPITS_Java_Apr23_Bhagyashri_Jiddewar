package ArrayList.SynchronizeArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(15);
        list.add(11);
        list.add(500);
        list.add(13);
        synchronized (list) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
