package multipleThread;

public class ThreadOneClass implements Runnable{
    @Override
    public void run() {
        for(int number=1;number<100;number++){
            if(number%2==0) {
                System.out.println("Even Number ="+number);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        }
    }
}
