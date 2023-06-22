public class Employee {
    private int employeeId;
    private String employeeName;
    private int EmployeeAge;
    private String Gender;
    private String Post;
    private String City;
    private String State;
    private  String salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPost(String post) {
        Post = post;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public String getGender() {
        return Gender;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }
}
