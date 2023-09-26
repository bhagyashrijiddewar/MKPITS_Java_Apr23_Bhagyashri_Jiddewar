package ConstructorReferenceToMethod;

public class Student {
    private String name;
    private int marks;
    private double fees;

    public Student(){

    }

    public Student(String name, int marks, double fees) {
        this.name = name;
        this.marks = marks;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name='" + name + '\'' +"\n"+
                ", marks=" + marks +"\n"+
                ", fees=" + fees +"\n"+
                '}';
    }
}
