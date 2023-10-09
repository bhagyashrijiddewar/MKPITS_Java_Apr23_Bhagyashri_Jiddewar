package IncreptDecreptMessage;
import java.security.MessageDigest;
import java.util.Arrays;

public class IncreptDecreptClass {
    public static void increptionMethod() {
        System.out.println("-----------Increption-------------");
        String str = "Hello";
        int ascii;
        for (int i = 0; i < str.length(); i++) {
            ascii = str.charAt(i);
            System.out.print((ascii + ascii % 10) + "-");
        }
        System.out.println();
    }
    public static void decretptionMethod() {

        System.out.println("-----------Decreption-------------");
        String string = "74-102-116-116-112";
      String[] str= string.split("-");
//        int AsciiCode = Integer.parseInt(string);
        for (int i = 0; i < str.length; i++) {
            int AsciiCode=Integer.parseInt(Arrays.toString(str));
            AsciiCode=AsciiCode-AsciiCode%10;
            char c = (char) AsciiCode;
            System.out.print(c);
        }
    }
    }





