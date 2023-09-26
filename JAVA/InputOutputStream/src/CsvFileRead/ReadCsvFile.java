package CsvFileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class ReadCsvFile {
    public static void readCsvFile() throws IOException {
        int word=0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the file name :");
         String fileName=bufferedReader.readLine();

        BufferedReader bufferedReader1=new BufferedReader(new FileReader(fileName));
         String fileRead=bufferedReader1.readLine();
         while(fileRead!=null){
                 String[] array=fileRead.split(",");
                 Formatter formatter = new Formatter();
                 formatter.format(array[0]+"\t"+array[1]);
                 System.out.println(formatter);
                 fileRead=bufferedReader1.readLine();
         }
    }
}
