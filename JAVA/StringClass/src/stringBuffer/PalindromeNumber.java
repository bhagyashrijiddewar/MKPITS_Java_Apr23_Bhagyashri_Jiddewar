package stringBuffer;

public class PalindromeNumber {
    public void checkPalindromeNumber(String string){
        StringBuffer stringBuffer=new StringBuffer(string);
        stringBuffer.reverse();
        // we can convert string buffer object to string object,after this we can use .equals method of string class can be accessible to compare two objects.
        if(string.equals(stringBuffer.toString())) {
            //But if we compare string obj into string buffer that time the .equals method not work bcoz this method not present in the string buffer.
            //If we want to compare string to buffer obj that time we can use .contentEquals method.

//            if(string.contentEquals(stringBuffer)) {
            System.out.println("Palindrome number.");
        }
        else
            System.out.println("Not a palindrome number.");
        }
    }

