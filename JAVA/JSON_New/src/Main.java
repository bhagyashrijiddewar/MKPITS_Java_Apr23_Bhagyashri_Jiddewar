import DecodeJSON.DecodeJSONStringInJava;
import EncodeJSON.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Encode JSonObject In Java------ : ");
       EncodeJSonObjectInJava.encodeJsonObject();
        System.out.println("------Encode JsonObject Using Map In Java-------- : ");
       EncodeJsonObjectUsingMapInJava.encodeJsonUsingMap();
        System.out.println("Encode JSONArray Using List In Java : ");
        EncodeJSONArrayUsingListInJava1.encodeJSONArrayInJava();
        System.out.println("-------Encode JSON Array In Java------- : ");
        EncodeJSONArrayInJava.encodeJSONArrayUsingListInJava();
        System.out.println("-------Decode JSON String In Java-------- : ");
        DecodeJSONStringInJava.decodeJSONStringInJava();
    }
}