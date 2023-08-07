public class Main {
    public static void main(String[] args) {
        int number=5;
        String str="12345";
        //---This syntax can be removed from jdk 17, if we want to perform this we use autoboxing.

//        ----Boxing---------
//        Integer number1=new Integer(number);
//
//      //-----Unboxing--------
//        int x=number1.ValueOf();

        //----------Autoboxing of integer type class----------
        //----Autoboxing----
        Integer b=number;

        //----AutoUnboxing----
        int j=b;

        //---Display output-----
        System.out.println(b);
        System.out.println(j);

        //----------Autoboxing of String type class----------

////        ----Boxing---------
//        String newString=new Integer(str);
//
//        //-----Unboxing--------
//        int x=newString.ValueOf();

        //----Auto Boxing-----
        Integer str1=Integer.parseInt(str);

        //----Auto Unboxing-----
        int str2=str1;

        //----Display output----
        System.out.println(str1);
        System.out.println(str2);

    }

}