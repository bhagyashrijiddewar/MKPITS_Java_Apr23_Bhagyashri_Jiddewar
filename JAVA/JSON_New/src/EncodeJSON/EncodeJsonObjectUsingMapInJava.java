package EncodeJSON;

import org.json.simple.JSONValue;

import java.util.HashMap;
import java.util.Map;

public class EncodeJsonObjectUsingMapInJava {
    public static void encodeJsonUsingMap(){
        Map obj=new HashMap();
        obj.put("name","Pranay");
        obj.put("age",25);
        obj.put("salary",25000);
    String jsonString  = JSONValue.toJSONString(obj);
        System.out.println(jsonString);
    }
}
