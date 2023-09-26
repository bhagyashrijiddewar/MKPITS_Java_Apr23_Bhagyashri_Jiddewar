package Test_2;
import java.io.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

//        ======================== Append text to existing file (WriteObjectReadObject)=================================

//           WriteObjectReadObject.displayData();
//        ----------------------------------------
//             WriteObjectReadObject.displayData();


//        ========================= Store data line by line (TextFileArrayLineByLine)===================================
//        ---------------------------- First Code ----------------------------------------------------

//         TextFileArrayLineByLine.displayArrayDataLineByLine();

//        ------------------------------ Second code --------------------------------------------------

//        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter array value : ");
//        TextFileArrayLineByLine.displayArrayDataLineByLine(bufferedReader.readLine());

//        ========================== Read First Three Line of file data ================================================

//         ReadFirstThreeLine.displayFirstThreeLine();

//        ========================== Search longest word ================================================
//------------------------------------------ (1) -----------------------------------------
//           SearchLogestWord searchLogestWord=new SearchLogestWord();
//           searchLogestWord.searchLongestWordMethod();
//        ------------------------------------- (2) -------------------------------------------------

//        SearchLogestWord searchLogestWord=new SearchLogestWord();
//        searchLogestWord.searchLongestWordMethod();
//        ---------------------------------------- (3) -------------------------------------------------

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the file name : ");
//        String fileName=scanner.next();
//
//        SearchLogestWord searchLogestWord=new SearchLogestWord();
//        searchLogestWord.searchLongestWordMethod(fileName);
//        ---------------------------------------- (4) -------------------------------------------------

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the file name : ");
        String fileName=scanner.next();

        SearchLogestWord searchLogestWord=new SearchLogestWord();
        searchLogestWord.searchLongestWordMethod(fileName);

//           ========================== Find charactor, lines and words from the file ================================================

//             FindCharLineWord.findNumberOfCharWordLines();
    }
}
