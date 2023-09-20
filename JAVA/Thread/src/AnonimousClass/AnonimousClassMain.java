package AnonimousClass;

public class AnonimousClassMain {
//   static int number=0;
    public static void main(String[] args){

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int number=0;number<5;) {
                    System.out.println("Red");
                    number++;
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int number=0;number<5;) {
                    System.out.println("blue");
                    number++;
                }
            }
        }).start();
        for(int number=0;number<5;) {
            System.out.println("white");
            number++;
        }
    }
}
