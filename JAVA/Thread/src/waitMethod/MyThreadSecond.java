package waitMethod;

public class MyThreadSecond implements Runnable{
     int total;
     int total1;
    //we do not need to initialize the value bcoz it is a globle variable,
    // it set the default value =0 by default constructor, we need to initialize the value to the local variable otherwise it display an error.

    public int getTotal() {
        return total;
    }

    public int getTotal1() {
        return total1;
    }

    @Override
//
    public void run() {

        synchronized (this){
            for(int number=0;number<10;number++){
                total+=number;
            }
            notify();
        }
        for(int number=0;number<5;number++){
            total1+=number;
        }

    }
}
