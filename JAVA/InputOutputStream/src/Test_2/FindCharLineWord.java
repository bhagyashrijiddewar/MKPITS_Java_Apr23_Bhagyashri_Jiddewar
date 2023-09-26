package Test_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindCharLineWord {
    public static void findNumberOfCharWordLines(){
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("nik.txt"));
            String string=bufferedReader.readLine();

            int wordCounter=0;
            int lineCounter=0;
            int charactor=0;

//            while (str!=null){
//                lineCounter++;
//                String[] arr=str.split(" ");
//                wordCounter=wordCounter+ arr.length;
//                char[] ch=new char[wordCounter];
//                for(int i=0;i<wordCounter;i++){
//                    charactor++;
//                }
//                str=bufferedReader.readLine();
//            }
//   ------------------------  while loop another type --------------------------
            while (string!=null){
                lineCounter++;
                String[] array=string.split(" ");
                wordCounter=wordCounter+ array.length;
                for(int initialValue=0;initialValue<array.length;initialValue++){
                    charactor=charactor+array[initialValue].length();
                }
                string=bufferedReader.readLine();
            }
            System.out.println("Number of lines in a file ="+lineCounter);
            System.out.println("Number of words in a file ="+wordCounter);
            System.out.println("Number of charactor in a file ="+charactor);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    }

