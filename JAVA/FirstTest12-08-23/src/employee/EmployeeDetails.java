package employee;

public abstract class EmployeeDetails {
    private String employeeName;
    private double paymentPerHour;

    public EmployeeDetails(String employeeName, double paymentPerHour) {
        this.employeeName = employeeName;
        this.paymentPerHour = paymentPerHour;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public abstract void calculateSalary();

}
