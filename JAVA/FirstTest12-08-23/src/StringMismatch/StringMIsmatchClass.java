package StringMismatch;

public class StringMIsmatchClass {
    private String str1;
    private String str2;

    public StringMIsmatchClass(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }
    public String getStr2() {
        return str2;
    }
    public  String displayStringResult() throws StringMismatchException{
        if(!str1.equals(str2))
            throw new StringMismatchException();
        return "String are match";
    }
}
