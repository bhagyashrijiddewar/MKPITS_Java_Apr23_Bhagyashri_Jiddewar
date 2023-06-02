 class MainAddition1{

public static void main(String[] args){
	
	//======================================================Addition of two numbers======================================================

     AdditionArithmaticOperatior1 addition=new AdditionArithmaticOperatior1();
	 System.out.println( "Addition of 2 integer number :  "+ " = " + addition.additionIntiger(150,120));
	 System.out.println( "Addition of 2 float number :  "+ " = " + addition.additionFloat(1.5f,4.8f));
	 System.out.println( "Addition of 2 double number :  "+ " = " + addition.additionDouble(45.8,23.6));
	 System.out.println( "Addition of 2 long number :  "+" = " + addition.additionLong(45689,5683658));
	 System.out.println( "Addition of 2 short number :  "+" = " + addition.additionShort(1,5));

      //System.out.println( "Addition of 2-numbers="+ number1 +" + "+ number2 +" = " + addition.additionIntiger(120,150));
	  //System.out.println( "Addition of 2-numbers= "+ addition.additionIntiger(120,150));
	  
}
}