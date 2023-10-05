package StudentData;

import java.sql.Date;

public class Student {
    private int roll_number;
    private String name;
    private  int std;
    private String city;
    private Date admission_Date;

    public Student(int roll_number, String name, int std, String city, Date admission_Date) {
        this.roll_number = roll_number;
        this.name = name;
        this.std = std;
        this.city = city;
        this.admission_Date = admission_Date;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }

    public String getCity() {
        return city;
    }

    public Date getAdmission_Date() {
        return admission_Date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_number=" + roll_number +
                ", name='" + name + '\'' +
                ", std=" + std +
                ", city='" + city + '\'' +
                ", admission_Date=" + admission_Date +
                '}';
    }
}
