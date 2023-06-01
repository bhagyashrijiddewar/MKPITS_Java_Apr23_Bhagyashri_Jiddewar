


class ArithmaticMulOperator{

  public int multiplicationInteger(int number1,int number2)
  {
    return number1 * number2 ;
  }
  
  
  public static void main(String[] args){
      int mul;
      ArithmaticMulOperator addition1=new ArithmaticMulOperator();
	  mul= addition1.multiplicationInteger(15,10);
	  System.out.println("Addition of 2-numbers:" +mul);
  }
  
  
}