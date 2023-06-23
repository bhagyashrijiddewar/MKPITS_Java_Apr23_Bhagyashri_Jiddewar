package com.mkpits.corejava.wrapper;

public class PrimitiveToWrapperLong {

    public long pLongValue = 982734921734l;
    public String sLongValue = "098127349812374";
    public int iLongValue=12354;
    public int pLongValue1=5326;
    public Long getLongWrapperFromPrimitive() {
        return Long.valueOf(pLongValue);
    }
    public Long getLongBFromStringValue() {
        return Long.valueOf(sLongValue);
    }
    public int getLongBitCountFromPrimitive() {
        return Long.bitCount(pLongValue);
    }
    public int getHAshCodeFromPrimitive() {
        return Long.hashCode(pLongValue);
    }
    public int getComparePrimitive() {
        return Long.compare(pLongValue,pLongValue1);
    }




//    public int getLongUnsigned() {
//        return Long.intValue(pLongValue);
//    }
//    toUnsignedLong()


}
