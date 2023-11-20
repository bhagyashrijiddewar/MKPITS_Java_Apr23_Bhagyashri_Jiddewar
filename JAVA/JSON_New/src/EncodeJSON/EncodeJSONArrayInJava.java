package EncodeJSON;

import org.json.simple.JSONArray;

public class EncodeJSONArrayInJava {
    public static void encodeJSONArrayUsingListInJava(){
        JSONArray jsonArray=new JSONArray();
        jsonArray.add("Abhi");
        jsonArray.add(30);
        jsonArray.add(30000);
        System.out.println(jsonArray);
    }
}
