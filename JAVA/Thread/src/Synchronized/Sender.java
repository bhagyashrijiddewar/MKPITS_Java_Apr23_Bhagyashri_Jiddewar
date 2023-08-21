package Synchronized;

public class Sender {
    public void send(String message)  {
        try {
            System.out.println("Sending Message"+message);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("Message sending processing"+message);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
