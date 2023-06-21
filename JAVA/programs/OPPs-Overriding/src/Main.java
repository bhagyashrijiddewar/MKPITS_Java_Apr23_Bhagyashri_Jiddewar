public class Main {
    public static void main(String[] args) {
        //--------------AreaOfCircle class override Area class--------------
        System.out.println("-----(Example-1)-------Area of Circle--------");
        AreaOfCircle area1=new AreaOfCircle();
        double result=area1.area(2);
        System.out.println(result);

        System.out.println("======================================================================");
        //-------------DebitAccount class override CreditAccount-------------

        System.out.println("-----(Example-2)-------Debit and Credit Amount--------");
        DebitAccount account=new DebitAccount();
        double totalBalance=account.credit(2000);
        System.out.println(totalBalance);
        System.out.println("======================================================================");

        //-------------StringValueOverride class override StringValue-------------

        System.out.println("-----(Example-3)------String Value Override--------");
        StringValueOverride stringValueObject=new StringValueOverride();
        stringValueObject.strValue();
        System.out.println("======================================================================");

        //-------------Tester class and Developer class override Employee class----------

        System.out.println("-----(Example-4)------Tester and developer class extends Employee class --------");
        Tester test=new Tester();
        Developer dev=new Developer();
        double totalSalary=dev.basicSalary(10);
        double totalSalaryTester=test.basicSalary(15);
        System.out.println("Total Salary of Developers = "+totalSalary);
        System.out.println("Total Salary of Tester = "+totalSalaryTester);
        System.out.println("======================================================================");


        //-------------volumeofSphere class override Volume  class-------------

        System.out.println("-----(Example-5)-----Volume of Sphere--------");
        VolumeOfSphere volumeResult=new VolumeOfSphere();
        double Result=volumeResult.volume(4.6);
        System.out.println("Volume of Sphere = "+Result);
        System.out.println("======================================================================");

        //-------------perimeterOfReactangle class override Perimeter  class-------------

        System.out.println("-----(Example-6)-----perimeter Of Reactangle--------");
        PerimeterOfRectangle perimeterResult=new PerimeterOfRectangle();
        double perrimeterOfRectangleResult= perimeterResult.perimeter(2.3,3.5);
        System.out.println("perimeter Of Reactangle :"+perrimeterOfRectangleResult);
        System.out.println("======================================================================");

        //-------(Example-7)------Child class override Parant class -------------

        System.out.println("-----(Example-7)-----Child class override Parant class--------");
        Child childproperty=new Child();
        //Child parantProperty=new Parant();
        childproperty.property("Devidas",25,8000000);
        childproperty.property("Bhagyashri Jiddewar",28,70000);
        System.out.println("======================================================================");

        //-------------StarChannal class override TVChannals class -------------

        System.out.println("-----(Example-8)-----StarChannal class override TVChannals class--------");
        StarChannals star=new StarChannals();
        star.channals();
        System.out.println("======================================================================");

        //-------------Standered class override School class -------------

        System.out.println("-----(Example-9)-----Standard class override School class--------");
        Standard selectStandard=new Standard();
        System.out.println("This is School class(Parant Class) result :");
        selectStandard.schoolType("High School","Z.P.");
        System.out.println("This is Standard class(Child Class) result :");
        selectStandard.schoolType("Primary School","Saint Xeviors",3,75000);
        System.out.println("======================================================================");

        //-------------Standered class override School class -------------

        System.out.println("-----(Example-10)-----Brand class override Pen class--------");
    }
}