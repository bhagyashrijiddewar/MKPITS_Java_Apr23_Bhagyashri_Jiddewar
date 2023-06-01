
public class TernaryOperator{  

public static void main(String args[]){  

int a=2;  
int b=5;  
int c=8;
int min=(a<b)?a:b;  // In This case the condition (a<b) is true thats why it prints the value of operand (a) which is in the if condition.
System.out.println("Stored the calculated value in the third operand : " +min);  
int max=(c<b)?c:b;  // In This case the condition (c<b) is false thats why it prints the value of operand (b) which is in the else condition
System.out.println("Stored the calculated value in the third operand : " +max);  
}}  