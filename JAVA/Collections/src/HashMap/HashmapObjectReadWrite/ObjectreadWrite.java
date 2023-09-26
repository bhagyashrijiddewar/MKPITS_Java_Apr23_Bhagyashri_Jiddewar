package HashMap.HashmapObjectReadWrite;

import java.io.*;
import java.util.HashMap;

public class ObjectreadWrite {
    public static void writeHashMapObject(HashMap hashmap) throws IOException {

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("hashmap.txt"));
        objectOutputStream.writeObject(hashmap);
        objectOutputStream.close();
    }
    public static void readHashMapObject(HashMap hashmap) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("hashmap.txt"));
        hashmap= (HashMap) objectInputStream.readObject();
        System.out.println(hashmap);
    }
}
