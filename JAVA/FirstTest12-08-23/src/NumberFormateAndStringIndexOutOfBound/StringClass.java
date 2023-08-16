package NumberFormateAndStringIndexOutOfBound;

public class StringClass {
    private static String string = "abcd";
    private static String string_1 = "bhagyshri";
    private static int number;

    public static void display() {
        number = Integer.parseInt(string);
    }
    public static void display_1() {
        string_1.charAt(20);
    }
}


