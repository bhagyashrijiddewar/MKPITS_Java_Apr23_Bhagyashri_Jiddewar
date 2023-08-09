package recursion;

public class ProgramIncrement {
    static int i=0;
    public static void display(){
        i++;
        if(i<=5){
            System.out.println("Hello");
            display();
        }
    }
    public static void main(String[] args){
        display();
    }
}
