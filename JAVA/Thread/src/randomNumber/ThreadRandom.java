package randomNumber;

import java.util.Random;

public class ThreadRandom implements Runnable{
    @Override
    public void run() {
//        Random random=new Random();
//        System.out.println(Math.random());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Random Number "+i+" = "+(int) (Math.random() * 100 + 1));
        }
    }
}
