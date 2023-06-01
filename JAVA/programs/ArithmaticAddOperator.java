


class ArithmaticAddOperator{

  public int additionInteger(int number1,int number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      int sum;
      ArithmaticAddOperator addition1=new ArithmaticAddOperator();
	  sum= addition1.additionInteger(16,10);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}