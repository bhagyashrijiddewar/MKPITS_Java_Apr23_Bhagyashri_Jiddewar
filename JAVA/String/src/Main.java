public class Main {
    public static void main(String[] args) {


            String str1="abc";
            String str2="abc";

            String str3=new String("abc");
            String str4=new String("abc");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1==str3);
        System.out.println(str3==str2);
        System.out.println(str3==str4);

        System.out.println("========================================");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        }
    }
