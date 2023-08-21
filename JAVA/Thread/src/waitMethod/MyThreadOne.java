package waitMethod;

public class MyThreadOne extends Thread{
   private int number1;
   private int number2;
   private int total;

    public MyThreadOne(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int getTotal() {
        return total;
    }

    @Override
    public void run() {
        synchronized (this) {
            total = number1 + number2;
            notify();
        }
    }
}



