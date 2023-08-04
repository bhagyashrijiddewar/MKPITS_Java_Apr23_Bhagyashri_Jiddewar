
import java.util.Scanner;
public class Addition{
 /**
*The below class perform addition of two numbers num1 and num2
* @param num1---- this is the first number 
* @param num2---- This is the secound number
* @param Sum---- Addition of two numbers
* E.g.---- 1. num1=2, num2=5, Sum= 7
*          2. num1=2, num2=-5, Sum= -3
*          3. num1=-2, num2=5, Sum= 3
*		   4. num1=-2, num2=-5, Sum= -7
*		   5. num1=0, num2=5, Sum= 5
*/
 public static void main(String[] args){
	 int num1,num2,Sum;
	 Scanner sc=new Scanner(System.in);
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	 
     Sum=num1+num2;
	 
 System.out.println("Addition of 2-numbers :" +Sum);
 }
 
} 