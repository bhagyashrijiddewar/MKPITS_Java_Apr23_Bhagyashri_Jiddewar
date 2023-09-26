package Test_2;

import java.io.*;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class SearchLogestWord {
    static String longestWord = "";
//    ---------------------------------- Buffered class using for loop -------------------------------------------------------
//    public  void searchLongestWordMethod(){

//        try {
//            BufferedReader bufferedReader= new BufferedReader(new FileReader("nik.txt"));
//            String string=bufferedReader.readLine();
//
//            int lineCounter=0;
//            while (string!=null) {
//                lineCounter++;
//                String[] array = string.split(" ");
//                for (int number = 0; number < array.length; number++) {
//                    if (longestWord.length() < array[number].length()){
//                        longestWord = array[number];
//                     }
//                 }
//                string=bufferedReader.readLine();
//            }
//                System.out.println("Longest word from file is "+longestWord);
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    ----------------------------------- Buffered class using for-each loop ---------------------------------------------
//        public  void searchLongestWordMethod(){
//
//        try {
//            BufferedReader bufferedReader= new BufferedReader(new FileReader("nik.txt"));
//            String string=bufferedReader.readLine();
//
//            int lineCounter=0;
//            while (string!=null) {
//                lineCounter++;
//                String[] array = string.split(" ");
//                for (String word:array) {
//
//                    if (longestWord.length() < word.length()){
//                        longestWord = word;
//                     }
//                 }
//                string=bufferedReader.readLine();
//            }
//                System.out.println("Longest word from file is "+longestWord);
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        } catch (IOException e) {
//            System.out.println(e);
//        }

    //        ------------------------------- Scanner class to find out longest word -------------------------------------------------
    public void searchLongestWordMethod(String fileName) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(fileName));
//--------------******** Change the while condition only *********-------------------

//         while(scanner.hasNext()){
//           String string=scanner.next();    //---Print the word with the hele of .next() method.
//             // Here we want to find out the length of the word thats why we can store this word in the variable.
//
//           if(string.length()>longestWord.length()){
//               longestWord=string;
//           }
//       }
//        ---------------******  Change the while condition only  ********-------------
        while(scanner.hasNext()){

            // we can store this word in the variable but if we want to avoid this variable space in the memory we directly write it in the bellow
            if(scanner.next().length()>longestWord.length()){
                longestWord=scanner.next();
            }
        }
        System.out.println(longestWord);

//        ------------------------------- Scanner class to print all the line  -------------------------------------------------
//                public void searchLongestWordMethod(String fileName) {
//                    try {
//                        Scanner scanner=new Scanner(new File(fileName));
//                        while(scanner.hasNext()){
//                           System.out.println(scanner.next());    //---Print the word with the hele of .next() method.
//                       }
//                    } catch (FileNotFoundException e) {
//                        System.out.println(e);
//                    }
               }
        }

