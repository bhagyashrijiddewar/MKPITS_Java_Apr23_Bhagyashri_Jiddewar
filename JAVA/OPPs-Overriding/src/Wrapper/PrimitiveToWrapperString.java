package Wrapper;

public class PrimitiveToWrapperString {
    public int pIntegerValue = 97;
    public String sLongValue = "97";
    //public int iLongValue=12354;
    public double doubleValue=12.35;
    public String getIntegerWrapperFromPrimitive() {
        return String.valueOf(pIntegerValue);
    }
    public String getDoubleWrapperFromPrimitive() {
        return String.valueOf(doubleValue);
    }
//    public String getBooleanWrapperFromPrimitive() {
//        return String.valueOf();
//    }
}
