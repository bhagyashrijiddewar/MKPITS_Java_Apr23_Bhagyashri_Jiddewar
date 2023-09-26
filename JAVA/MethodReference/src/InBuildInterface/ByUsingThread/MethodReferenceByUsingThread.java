package InBuildInterface.ByUsingThread;

public class MethodReferenceByUsingThread {
    public static void displayOddNumber(){
        int number=1;
        System.out.println("Odd number by using Thread Class : ");
        while(number<100){
            if(number%2==1)
                System.out.print(number+" ");
            number++;
        }
    }
}
