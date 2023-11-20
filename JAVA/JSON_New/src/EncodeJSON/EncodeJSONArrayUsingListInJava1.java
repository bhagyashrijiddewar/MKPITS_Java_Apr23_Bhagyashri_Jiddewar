package EncodeJSON;

import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.List;

public class EncodeJSONArrayUsingListInJava1 {
    public static void encodeJSONArrayInJava(){
        List array=new ArrayList();
        array.add("Abhishek");
        array.add(26);
        array.add(26000);
       String string= JSONValue.toJSONString(array);
        System.out.println(string);
    }
}
