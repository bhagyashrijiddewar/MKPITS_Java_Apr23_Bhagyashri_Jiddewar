package recursion;

import java.util.Scanner;

public class FactorialRecursion {
public static int display(int number){
    int factorial=1;
    while(number>0){
        factorial=factorial*number;
        number--;
    }
    return factorial;
}

public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number to find out factorial of that number : ");
    System.out.println(display(scanner.nextInt()));
}
}
