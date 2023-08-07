public class Main {
    public static void main(String[] args) {
        //--------------Using constructor of string class -------

        String str1="bhagyashri"; //'str1' is a string variable and 'bhagyashri' is a literals.
        char[] ch={'a','b','c','d'}; // 'charecter' type of array
        String str2=new String(ch);  //create an object of array 'ch'
        String str3 = new String("Jiddewar"); // Create an object of string class
        String str4=new String("Bhagyashri");
        String str6=new String("bhagyashri");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //--------------Using methods of string class --------------

        System.out.println("1. Concat str3 and str4 : "+str4.concat(" "+str3)); //concat method
        System.out.println("2. Character of that index number : "+str2.charAt(2));            //chatAt method
        System.out.println("3. Ascii value of index value :"+str2.codePointAt(2)); //codePointAt
        System.out.println("4. Index of the value :"+str4.indexOf('g'));         //indexOf
        String strConcat=str4.concat(" "+str3);   //concat
        System.out.println("5.Concat two String : "+strConcat);
        System.out.println("7. Replace character 'i' "+str4+" to 'e' "+str4.replace('i','e')); //replace
        String[]str5=strConcat.split(" ");      //split
        for(String i:str5){
            System.out.println("6. Split the string from space : "+i);
        }

        System.out.println("8.Length of string : "+str3.length());
        System.out.println("9.Hashcode of string :  "+ str3.hashCode());
        System.out.println("10. CompareTo method :"+str4.compareTo(str6));//output :str4=Bhagyashri and str6=bhagyashri (B=66 and b=98) 66-98=-32
        System.out.println("11. CompareToIgoreCase :"+str4.compareToIgnoreCase(str6)); //Compare avoiding uppercase and lowercase character

    }
}