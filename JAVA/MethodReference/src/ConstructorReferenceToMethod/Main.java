package ConstructorReferenceToMethod;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface=Student::new;

//        ------- display an object, to override toString() method-----
        System.out.println(myInterface.getStudent("Pranay",80,12000));

//-----------store the value in the object and call the getName()method of that attribute------
        Student student= myInterface.getStudent("abhi",90,10000);
        System.out.println(student.getName());
        System.out.println(student.getMarks());
        System.out.println(student.getFees());
    }
}
