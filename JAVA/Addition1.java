class Substraction{

 public int substractionInteger(int number1,int number2){
  return number1 - number2 ;
 }
}
class Addition1{
	
  //public static int additionInteger1(int number1,int number2){
  public static int additionInteger1(int number1,int number2)
  {
  return number1 + number2 ;
 }
 
 public int multiplication(int number1, int number2)
 {
  return number1 * number2 ;
 }
 public int division(int number1, int number2){
	 return number1 / number2 ;
 }
 
 public static void main(String[] args){
      int sum,sub,mul,div;
      Addition1 addition1=new Addition1();
	  sum= addition1.additionInteger1(10,15);
	  //sum=additionInteger1(12,15);
	  
	  Substraction substract =new Substraction();
	  sub= substract.substractionInteger(20,5);
	  
	  mul=addition1.multiplication(5,10);
	  div=addition1.division(10,2);
	  
	  System.out.println("Addition of 2-numbers : "+sum);
	  System.out.println("Substaction of 2-numbers : "+sub);
	   System.out.println("Multiplication of 2-numbers : "+mul);
	  System.out.println("Division of 2-numbers : "+div);

	
  }
  
  
}