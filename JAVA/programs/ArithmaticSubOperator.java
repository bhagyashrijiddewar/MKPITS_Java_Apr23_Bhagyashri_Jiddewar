


class ArithmaticSubOperator{

  public int substractInteger(int number1,int number2)
  {
    return number1 - number2 ;
  }
  
  
  public static void main(String[] args){
      int sub;
      ArithmaticSubOperator addition1=new ArithmaticSubOperator();
	  sub= addition1.substractInteger(15,10);
	  System.out.println("Addition of 2-numbers:" +sub);
  }
  
  
}