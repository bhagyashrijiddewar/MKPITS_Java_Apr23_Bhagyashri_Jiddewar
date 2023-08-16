public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello this is my first program.");

            System.out.println("Display the Current Thread name :"+Thread.currentThread().getName());

//        Thread.currentThread().setPriority(6);
//        System.out.println(Thread.currentThread().getPriority());
    }
}
