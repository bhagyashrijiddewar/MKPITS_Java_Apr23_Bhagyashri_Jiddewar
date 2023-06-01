


class ArithmaticModuleOperator{

  public int moduletiplicationInteger(int number1,int number2)
  {
    return number1 % number2 ;
  }
  
  
  public static void main(String[] args){
      int module;
      ArithmaticModuleOperator addition1=new ArithmaticModuleOperator();
	  module= addition1.moduletiplicationInteger(15,10);
	  System.out.println("Reminder of 2-numbers:" +module);
  }
  
  
}