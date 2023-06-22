public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        PersonName p1=new PersonName();
        p.setName("Nikhil");
       String name= p.getName();
        System.out.println(name);
        p1.setpName("Bhagyashri");
        String p_Name=p1.getpName();
        System.out.println(p_Name);
        Employee emp=new Employee();
        emp.setEmployeeId(1);
        emp.setEmployeeName("Abhishek");
        emp.setEmployeeAge(24);
        emp.setGender("Male");
        emp.setCity("Nanded");
        emp.setState("Maharashtra");
        emp.setSalary("50000");
        String empName=emp.getEmployeeName();
        System.out.println(empName);
        String gen=emp.getGender();
        System.out.println(gen);
        int age=emp.getEmployeeAge();
        System.out.println(age);
        String city=emp.getCity();
        System.out.println(city);
        String state=emp.getState();
        System.out.println(state);





    }
}