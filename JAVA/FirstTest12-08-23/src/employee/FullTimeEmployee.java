package employee;

public class FullTimeEmployee extends EmployeeDetails {
    private  double employeeworkingHours;

    public double getEmployeeworkingHours() {
        return employeeworkingHours;
    }
    public void setEmployeeworkingHours(double employeeworkingHours) {
        this.employeeworkingHours = employeeworkingHours;
    }
    public FullTimeEmployee(String employeeName, double paymentPerHour) {
        super(employeeName, paymentPerHour);
    }
    @Override
    public void calculateSalary() {
        double salary=getEmployeeworkingHours()*super.getPaymentPerHour();
        System.out.println("Salary of Full Time Employee = "+salary);
    }
}
