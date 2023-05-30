


class Addition5{

  public byte additionbyte(byte number1,byte number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      int sum;
      Addition5 addition=new Addition5();
	  sum= addition.additionbyte(1,2);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}