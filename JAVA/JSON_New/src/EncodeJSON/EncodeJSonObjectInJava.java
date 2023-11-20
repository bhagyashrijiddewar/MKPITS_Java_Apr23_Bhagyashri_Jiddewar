package EncodeJSON;

import org.json.simple.JSONObject;

public class EncodeJSonObjectInJava {
    public static void encodeJsonObject(){
        JSONObject obj=new JSONObject();
        obj.put("name","sonoo");
        obj.put("age", 27);
        obj.put("salary",600000);
        System.out.println(obj);
    }
}
