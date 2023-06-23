package com.mkpits.corejava.wrapper;

public class PrimitiveToWrapperInteger {

    public int pIntegerValue = 97;
    public String sLongValue = "97";
    //public int iLongValue=12354;
    public int getIntegerWrapperFromPrimitive() {
        return Integer.valueOf(pIntegerValue);
    }
    public String gettoStringWrapperFromPrimitive() {
        return Integer.toString(pIntegerValue);
    }
    public String gettoBinaryWrapperFromPrimitive() {
        return Integer.toBinaryString(pIntegerValue);
    }
    public String gettoUnsignStringWrapperFromPrimitive() {
        return Integer.toUnsignedString(pIntegerValue);

    }
    public int getParseIntWrapperFromPrimitive() {
        return Integer.parseInt(sLongValue);
    }

    public String gettoHexaStringWrapperFromPrimitive() {
        return Integer.toHexString(pIntegerValue);

    }
    public String gettoOctalStringWrapperFromPrimitive() {
        return Integer.toOctalString(pIntegerValue);

    }
    public long gettoUnsignedLongStringWrapperFromPrimitive() {
        return Integer.toUnsignedLong(pIntegerValue);

    }

    public int gethighestOneBitWrapperFromPrimitive() {
        return Integer.highestOneBit(pIntegerValue);

    }
    public int getlowestOneBitWrapperFromPrimitive() {
        return Integer.lowestOneBit(pIntegerValue);

    }
    public String gettoStringRadixWrapperFromPrimitive() {
        return Integer.toString(pIntegerValue);

    }


}
