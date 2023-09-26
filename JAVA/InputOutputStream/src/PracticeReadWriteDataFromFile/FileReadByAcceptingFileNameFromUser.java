package PracticeReadWriteDataFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadByAcceptingFileNameFromUser {
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name :");
        try {
          String fileRead= bufferedReader.readLine();
          BufferedReader bufferedReader1=new BufferedReader(new FileReader(fileRead));
         String fileDataRead=bufferedReader1.readLine();
         while (fileDataRead!=null){
             System.out.println(fileDataRead);
             fileDataRead=bufferedReader1.readLine();
         }
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
