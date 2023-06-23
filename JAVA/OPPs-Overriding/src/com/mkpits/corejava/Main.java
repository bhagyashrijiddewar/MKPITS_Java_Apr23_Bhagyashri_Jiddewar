package com.mkpits.corejava;

import com.mkpits.corejava.wrapper.PrimitiveToWrapperLong;
import com.mkpits.corejava.wrapper.PrimitiveToWrapperInteger;

public class Main {

    public static  void main(String args[]) {

        //---------------------------------Long Wrapper class-------------------------------

        PrimitiveToWrapperLong primitiveToWrapper = new PrimitiveToWrapperLong();
        System.out.println("Long value is: " + primitiveToWrapper.getLongWrapperFromPrimitive());
        System.out.println("Bit count of Long: " + primitiveToWrapper.getLongBitCountFromPrimitive());
        System.out.println("Long from string value: " + primitiveToWrapper.getLongBFromStringValue());
        System.out.println("Convert back to String from Long from string value: " + String.valueOf(primitiveToWrapper.getLongBFromStringValue()));
        System.out.println("Long value compare is: " + primitiveToWrapper.getComparePrimitive());
        System.out.println("Long value of hash Code is: " + primitiveToWrapper.getHAshCodeFromPrimitive());


        //---------------------------------Integer Wrapper class-------------------------------
        System.out.println("--------------------------------Integer Wrapper class-------------------------------");
        PrimitiveToWrapperInteger primitiveToWrapperInteger=new PrimitiveToWrapperInteger();
        System.out.println("Integer value is : "+primitiveToWrapperInteger.getIntegerWrapperFromPrimitive());
        System.out.println("Integer from string value : "+ primitiveToWrapperInteger.gettoStringWrapperFromPrimitive());
        System.out.println("Integer from Unsigned String value : "+ primitiveToWrapperInteger.gettoUnsignStringWrapperFromPrimitive());
        System.out.println("Integer from Hexadecimal value : "+ primitiveToWrapperInteger.gettoHexaStringWrapperFromPrimitive());
        System.out.println("Integer from parse value"+ primitiveToWrapperInteger.getParseIntWrapperFromPrimitive());
        System.out.println("Integer from Octal value : "+ primitiveToWrapperInteger.gettoOctalStringWrapperFromPrimitive());
        System.out.println("Integer from UnsignedLong value : "+ primitiveToWrapperInteger.gettoUnsignedLongStringWrapperFromPrimitive());
        System.out.println("Integer from HighestOneBit value : "+ primitiveToWrapperInteger.gethighestOneBitWrapperFromPrimitive());
        System.out.println("Integer from LowestOneBit value : "+ primitiveToWrapperInteger.getlowestOneBitWrapperFromPrimitive());
        System.out.println("Integer from toStringRadix value : "+ primitiveToWrapperInteger.gettoStringRadixWrapperFromPrimitive());



    }
}
