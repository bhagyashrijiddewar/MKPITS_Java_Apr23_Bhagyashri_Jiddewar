
public class UnaryCalculationOperator{  
public static void main(String args[]){  
int a=11;  
int b=3;  
System.out.println(a++ + ++a);//11+13=24
//System.out.println("Subtraction of 2 increment number : "+ a++ - b++);//
System.out.println("Division of 2 increment number : "+ a++ / b++);// 
 System.out.println("Multiplication of 2 increment number : "+ a++ * b++);//13*5=65
 System.out.println("Modulus of 2 increment number : "+ a++ % b++);//
  
}}  