package SerializableReaderWriterOnObject;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
}

