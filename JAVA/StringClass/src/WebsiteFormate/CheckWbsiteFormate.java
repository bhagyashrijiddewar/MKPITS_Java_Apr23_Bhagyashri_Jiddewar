package WebsiteFormate;

import java.util.Arrays;

public class CheckWbsiteFormate {
    public static void checkWebsiteFormat(String str){
        if(str.substring(0,10).equals("http://www")) {
            if (str.substring(10).contains("."))
                System.out.println("VAlid Website Formate.");
            else
                System.out.println("Invalid website formate.");
        }
            else
                 System.out.println("Invalid website formate.");
        }

}



