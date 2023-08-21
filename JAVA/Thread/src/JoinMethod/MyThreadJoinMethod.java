package JoinMethod;

public class MyThreadJoinMethod implements Runnable{
    public void run(){
        for(int number=1;number<=10;number++){
            System.out.println("Name of the Thread :"+Thread.currentThread().getName());
        }
    }
}
