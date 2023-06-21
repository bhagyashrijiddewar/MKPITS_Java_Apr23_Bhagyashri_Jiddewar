public class Main {
    public static void main(String[] args) {
        //--------------AreaOfCircle class override Area class--------------

        AreaOfCircle area1=new AreaOfCircle();
        double result=area1.area(2);
        System.out.println(result);


        //-------------DebitAccount class override CreditAccount-------------

        DebitAccount account=new DebitAccount();
        double totalBalance=account.credit(2000);
        System.out.println(totalBalance);

        //-------------StringValueOverride class override StringValue-------------

        StringValueOverride stringValueObject=new StringValueOverride();
        stringValueObject.strValue();

        //-------------Tester class and Developer class override Employee class-------------

        Tester test=new Tester();
        Developer dev=new Developer();
        double totalSalary=dev.basicSalary(10);
        System.out.println("Total Salary of Developers = "+totalSalary);

    }
}