package StringPoolConstant;

public class StringPoolExample {
    public static void main(String[] args){
         String str1="Abhishek";
         String str2="Abhishek";
         String str3="Pranay";

         String str4=new String("Pranay");
         String str7=new String("Pranay");
         String str5=new String("Abhishek");
         String str6=new String("Abhishek").intern();

        System.out.println(str1==str2);
        System.out.println(str1==str5);
        System.out.println(str1==str6);
        System.out.println(str1.equals(str5));
        System.out.println(str4.equals(str7));


    }

}
