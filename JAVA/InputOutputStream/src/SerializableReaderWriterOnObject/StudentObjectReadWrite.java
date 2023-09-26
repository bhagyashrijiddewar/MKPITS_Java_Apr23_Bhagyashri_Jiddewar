package SerializableReaderWriterOnObject;

import java.io.*;

public class StudentObjectReadWrite  {
    public static void studentWriteObject(Student student) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Student.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
//    ----------------------------------------------------------------------------------

//    public static void studentReadObject(Student student) throws IOException {
//
//        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("Student.txt"));
//        try {
//           student=(Student)objectInputStream.readObject();
//            System.out.println("Student Name = "+student.getName()+"\n "+"Marks = "+student.getMarks());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
//    }
////-------------------------------------------------------------------------------------
//    public static Student studentReadObject(Student student) throws IOException {
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Student.txt"));
//        try {
//            student = (Student) objectInputStream.readObject();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e);
//        }
//        return student;
//    }
//-------------------------------------------------------------------------------------
public static Object studentReadObject() throws IOException, ClassNotFoundException {

    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Student.txt"));

    return objectInputStream.readObject();
    }

}
