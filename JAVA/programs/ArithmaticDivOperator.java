


class ArithmaticDivOperator{

  public int divisionInteger(int number1,int number2)
  {
    return number1 / number2 ;
  }
  
  
  public static void main(String[] args){
      int div;
      ArithmaticDivOperator addition1=new ArithmaticDivOperator();
	  div= addition1.divisionInteger(16,4);
	  System.out.println("Division of 2-numbers:" +div);
  }
  
  
}