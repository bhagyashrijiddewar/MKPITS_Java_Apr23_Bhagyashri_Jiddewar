package com.mkpits.corejava.wrapper;

public class PrimitiveToWrapperLong {

    public long pLongValue = 982734921734l;
    public String sLongValue = "098127349812374";
    public Long getLongWrapperFromPrimitive() {
        return Long.valueOf(pLongValue);
    }

    public int getLongBitCountFromPrimitive() {
        return Long.bitCount(pLongValue);
    }

    public Long getLongBFromStringValue() {
        return Long.valueOf(sLongValue);
    }

}
