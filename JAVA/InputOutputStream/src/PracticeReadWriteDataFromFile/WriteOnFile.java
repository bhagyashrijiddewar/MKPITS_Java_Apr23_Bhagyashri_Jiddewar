package PracticeReadWriteDataFromFile;

import java.io.*;

public class WriteOnFile {
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;
    public void DataWriteOnFile(){
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedWriter = new BufferedWriter(new FileWriter("newFile.txt"));
            System.out.println("Enter the data which you want to write : ");
            String readData = bufferedReader.readLine();
            while (true) {
                if(readData.equals("end")){
                    break;
                }
                bufferedWriter.write(readData+"\n");
                readData=bufferedReader.readLine();
            }
            bufferedWriter.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        public void readDataFromFile(){
            System.out.println("Display File Data :");
            try {
                bufferedReader=new BufferedReader(new FileReader("newFile.txt"));
                String readFileData=bufferedReader.readLine();
                while (readFileData!=null){
                    System.out.println(readFileData);
                    readFileData=bufferedReader.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



