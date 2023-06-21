public class Main {
    public static void main(String[] args) {
        //--------------AreaOfCircle class override Area class--------------
        System.out.println("-----(Example-1)-------Area of Circle--------");
        AreaOfCircle area1=new AreaOfCircle();
        double result=area1.area(2);
        System.out.println(result);


        //-------------DebitAccount class override CreditAccount-------------

        System.out.println("-----(Example-2)-------Debit and Credit Amount--------");
        DebitAccount account=new DebitAccount();
        double totalBalance=account.credit(2000);
        System.out.println(totalBalance);

        //-------------StringValueOverride class override StringValue-------------

        System.out.println("-----(Example-3)------String Value Override--------");
        StringValueOverride stringValueObject=new StringValueOverride();
        stringValueObject.strValue();

        //-------------Tester class and Developer class override Employee class----------

        System.out.println("-----(Example-4)------Tester and developer class extends Employee class --------");
        Tester test=new Tester();
        Developer dev=new Developer();
        double totalSalary=dev.basicSalary(10);
        double totalSalaryTester=test.basicSalary(15);
        System.out.println("Total Salary of Developers = "+totalSalary);
        System.out.println("Total Salary of Tester = "+totalSalaryTester);


        //-------------Volume class override volumeofSphere class-------------

        System.out.println("-----(Example-5)-----Volume of Sphere--------");
        VolumeOfSphere volumeResult=new VolumeOfSphere();
        double Result=volumeResult.volume(4.6);
        System.out.println("Volume of Sphere = "+Result);

    }
}