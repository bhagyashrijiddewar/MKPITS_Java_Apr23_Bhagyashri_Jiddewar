package Synchronized;

public class ThreadedSendObjectSynchronization extends Thread{
    private String message;
    Sender sender;

    public ThreadedSendObjectSynchronization(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run(){
//        Here we can synchronized the object of class sender.

        synchronized (sender) {
            sender.send(message);
        }
    }
}
