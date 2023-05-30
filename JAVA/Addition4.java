


class Addition4{

  public short additionshort(short number1,short number2)
  {
    return number1 + number2 ;
  }
  
  
  public static void main(String[] args){
      short sum;
      Addition4 addition=new Addition4();
	  sum= addition.additionshort(115,200);
	  System.out.println("Addition of 2-numbers:" +sum);
  }
  
  
}