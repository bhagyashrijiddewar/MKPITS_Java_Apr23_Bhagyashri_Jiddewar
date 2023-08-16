package multipleThread;

public class ThreadTwoClass implements Runnable{
    @Override
    public void run() {
        for(int number=1;number<100;number++){
            if(number%2==1){
                System.out.println("Odd Number ="+number);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }catch (IllegalArgumentException e){
                    System.out.println(e);
                }
            }
        }
    }
}
