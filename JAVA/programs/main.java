public class main{

public static void main(String[] args){
int number1=250,number2=126;
float number3=1.5f, number4=6.5f;
double number5=12.5, number6=45.6;
long number7=12345, number8=236584;
short number9=1,number10=5;
     AdditionArithmaticOperatior addition=new AdditionArithmaticOperatior();
	 System.out.println( "Addition of 2 integer number :  "+ number1 +" + "+ number2 +" = " + addition.additionIntiger(number1,number2));
	 System.out.println( "Addition of 2 float number :  "+ number3 +" + "+ number4 +" = " + addition.additionFloat(number3,number4));
	 System.out.println( "Addition of 2 double number :  "+ number5 +" + "+ number6 +" = " + addition.additionDouble(number5,number6));
	 System.out.println( "Addition of 2 long number :  "+ number7 +" + "+ number8 +" = " + addition.additionLong(number7,number8));
	 System.out.println( " Addition of 2 short number :  "+ number9 +" + "+ number10 +" = " + addition.additionShort(number9,number10));

      //System.out.println( "Addition of 2-numbers="+ number1 +" + "+ number2 +" = " + addition.additionIntiger(120,150));
	  //System.out.println( "Addition of 2-numbers= "+ addition.additionIntiger(120,150));

   
}
}