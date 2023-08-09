package recursion;

public class Factorial {
    public static int display(int number ){
        int factorial=1;
        while (number>0){
            factorial=factorial*number;
            number--;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println(display(5));
    }
}
