package BufferReader;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromFile {
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.text"));
            String string= bufferedReader.readLine();
            while(string!=null) {
                System.out.println(string);
                string= bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchLongestWordMethod(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());    //---Print the word with the hele of .next() method.
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
