package HashMap.HashmapObjectReadWrite;

import java.io.IOException;
import java.util.HashMap;

public class HashmapClass {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
            HashMap hashMap=new HashMap();
            hashMap.put(77,205);
            hashMap.put(25,300);
            hashMap.put(85,60);
            hashMap.put(38,555);
            hashMap.put(67,88);

            ObjectreadWrite.writeHashMapObject(hashMap);
            ObjectreadWrite.readHashMapObject(hashMap);

    }
}
