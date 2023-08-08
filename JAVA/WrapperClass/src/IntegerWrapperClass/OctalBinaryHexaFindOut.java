package IntegerWrapperClass;

public class OctalBinaryHexaFindOut {
    private String str="12345";
    public void displayValue(int number){
        System.out.println("Binary Equivalent to "+number+"=" +Integer.toBinaryString(number));
        System.out.println("Octal Equivalent value = "+Integer.toOctalString(number));
        System.out.println("Hexadecimal Equivalent value = "+Integer.toHexString(number));
        System.out.println("String value converted into integer ="+Integer.parseInt( str));
        System.out.println("Integer converted into String value ="+ Integer.toString(number));
        System.out.println("Compare the value (10-52=-42 -> It will return zero bcoz -nus gives you (-1) +s gives you (1) and if equals then return zero.) ="+Integer.compare(10,52));
        System.out.println("to Unsigned String ="+ Integer.toUnsignedString(number));
        System.out.println("Bit count of a number :"+Integer.bitCount(number));
        System.out.println(""+Integer.decode(str));

    }
}
