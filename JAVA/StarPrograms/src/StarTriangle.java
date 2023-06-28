import java.util.Scanner;

public class StarTriangle extends StarPattern {
public int starpattern(int number1){

        for(int row = 0;row<=number1;row++){
            for (int space = number1; space>=row; space--) {
                System.out.print(" ");
            }
//            for (int space = 0; space <= (row*2); space++) {
//                if(space % 2 == 0){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
            for(int star=1;star<=row;star++){
                System.out.print(" *");
            }
            System.out.println();
        }
        return 0;
    }
}







