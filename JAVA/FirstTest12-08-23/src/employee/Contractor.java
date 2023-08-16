package employee;

public class Contractor extends EmployeeDetails{
    private double workingHours;

    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
    public Contractor(String employeeName, double paymentPerHour) {
        super(employeeName, paymentPerHour);
    }
    @Override
    public void calculateSalary() {
        double salary=getWorkingHours()*getPaymentPerHour();
        System.out.println("Contractor salary =  "+salary);
    }
}
