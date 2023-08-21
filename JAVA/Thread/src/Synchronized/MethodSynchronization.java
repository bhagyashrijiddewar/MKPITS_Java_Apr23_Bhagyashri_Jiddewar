package Synchronized;

public class MethodSynchronization extends Thread{
    private String message;

    public MethodSynchronization(String message) {
        this.message = message;
    }
    public synchronized void send(){
        System.out.println("First Thread :"+message);
        System.out.println("Second Thread :"+message);
    }
    public void run(){
        send();
    }
}
