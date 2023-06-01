
public class LogicalBitwiseOperator{  

public static void main(String args[]){  

int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&a<c);//false & true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b&a<c);//True & true = True  
System.out.println(a);//11 because second condition is checked  
System.out.println(a<b | a<c);//false & true = True  
System.out.println(c);//10 because second condition is not checked  
System.out.println(a<b|a>c);//false & False = false  
System.out.println(a);//11 because second condition is checked 
}}  