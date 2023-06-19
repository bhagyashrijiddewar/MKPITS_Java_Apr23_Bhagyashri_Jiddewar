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
    }
}