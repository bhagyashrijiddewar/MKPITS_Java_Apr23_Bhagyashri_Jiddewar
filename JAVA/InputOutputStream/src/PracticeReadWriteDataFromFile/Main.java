package PracticeReadWriteDataFromFile;

public class Main {
    public static void main(String[] args){
//        ------------------------- File Read By Accepting File Name From User --------------------------------------
//        FileReadByAcceptingFileNameFromUser studentClass=new FileReadByAcceptingFileNameFromUser();

//        -----------------------Write on file -------------------------------

        WriteOnFile writeOnFile=new WriteOnFile();
        writeOnFile.DataWriteOnFile();
        System.out.println("-------------------------");
        writeOnFile.readDataFromFile();
    }
}
