public class Main {
    public static void main(String[] args) {
//   ----------Addition of 2-number and 3-numbers by using Methode Overloading--------------
        OverloadingAddition add=new OverloadingAddition();
        System.out.println("Addition : ");
        System.out.println("Addition of 2-number : ");
        int sum=add.addition(5,6);
        System.out.println(sum);
        System.out.println("Addition of 3-number : ");
        int sum1= add.addition(5,6,8);
        System.out.println(sum1);
        //   ----------Substraction of 2-number and 3-numbers by using Methode Overloading--------------

        OverloadingSubstraction sub=new OverloadingSubstraction();
        System.out.println("Substraction : ");
        System.out.println("Substraction of 2-number : ");
        int minus=sub.substract(8,5);
        System.out.println(minus);
        System.out.println("Substraction of 3-number : ");
        int minus1=sub.substract(12,4,5);
        System.out.println(minus1);

        //   ----------Multiplication of 2-number and 3-numbers by using Methode Overloading--------------

        OverloadingMultiplication multiplication=new OverloadingMultiplication();
        System.out.println("Multiplication : ");
        System.out.println("Multiplication of 2-number : ");
        int mul=multiplication.multiple(8,5);
        System.out.println(mul);
        System.out.println("Multiplication of 3-number : ");
        int mul1=multiplication.multiple(12,4,5);
        System.out.println(mul1);

        //   ----------Division of 2-number and 3-numbers by using Methode Overloading--------------

        OverloadingDivision divide=new OverloadingDivision();
        System.out.println("Division : ");
        System.out.println("Division of 2-number : ");
        int div=divide.division(8,5);
        System.out.println(div);
        System.out.println("Division of 3-number : ");
        int div1=divide.division(12,4,5);
        System.out.println(div1);


        //   ----------Modulus of 2-number and 3-numbers by using Methode Overloading--------------

        OverloadingModulus modulus=new OverloadingModulus();
        System.out.println("Modulus : ");
        System.out.println("Modulus of 2-number : ");
        int mod=modulus.modulus(8,5);
        System.out.println(mod);
        System.out.println("Modulus of 3-number : ");
        int mod1=modulus.modulus(14,5,3);
        System.out.println(mod1);

        //   ----------String conacatinate by overloading using Methode Overloading--------------

        ConcateString concateString=new ConcateString();
        System.out.println("String-Integeger Value : ");
        concateString.integerValue(25);
        concateString.stringValue("Welcome to MKPITS");

        //   ----------Person Details by overloading using Methode Overloading--------------

        PersonDetails person=new PersonDetails();
        System.out.println("-----------Person Details :---------- ");
        person.details("Bhagyashri Jiddewar","Female");
        person.details("Bhagyashri Panchalwar","Female",28);



        //   ----------Person Details by overloading using Methode Overloading--------------

        Parants parant=new Parants();
        System.out.println("----------parant Details:--------- ");
        parant.property("Jiddewar",500000);
        parant.property("Bhagyashri","Jiddewar",600000,"Kind/Humble");

        //   ----------Perimeter of rectangle and semi-circle by overloading using Methode Overloading--------------

        Parimeter parimeter=new Parimeter();
        System.out.println("----------Perimeter of rectangle and semicircle:--------- ");
        double perimeterSemicircle=parimeter.perimeter(5);
        double perimeterRectangle =parimeter.perimeter(6,3.14);
        System.out.println("Perimeter of Semicircle= "+perimeterSemicircle);
        System.out.println("Perimeter of Reactangle= "+perimeterRectangle);

        //   ----------Volume of square and Sphere by overloading using Methode Overloading--------------

        Volume volumeOf=new Volume();
        System.out.println("----------Volume of square and Sphere :--------- ");
       double volumeOfSquare= volumeOf.volume(5);
       double volumeOfSphere= volumeOf.volume(3.2);
       System.out.println("Volume of square= "+volumeOfSquare);
       System.out.println("Volume of Sphere= "+volumeOfSphere);
    }
}