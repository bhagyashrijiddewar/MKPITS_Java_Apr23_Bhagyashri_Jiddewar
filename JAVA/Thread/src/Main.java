import multipleThread.ThreadOneClass;
import multipleThread.ThreadPrime;
import multipleThread.ThreadTwoClass;
import randomNumber.ThreadRandom;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread=new MyThread("ChangeThreadName");
//        System.out.println("Hi");
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println("-------------------------------");
////        myThread.setName("NewThread");
//        System.out.println("Change the thread name and get the new name: "+myThread.getName());
//        System.out.println("-------------------------------------");
//        myThread.start();
//        System.out.println(myThread.getName());
//        System.out.println("-------------------------------");
//        System.out.println("MyThread priority : "+myThread.getPriority());
//        System.out.println("bye");
//        System.out.println("-------------------------------");
//        System.out.println("Display Created thread name :"+myThread.getName());
//        System.out.println("By default thread name :"+Thread.currentThread().getName());
////       the output this is bcz of thread priority.

//        ============================== Runnable Interface ==============================================

//        RunnableInterface runnableInterface=new RunnableInterface();
//        Thread thread=new Thread(runnableInterface,"RunnableThread");
////        thread.setPriority(7); // this is the best way to set the priority to the thread
////        We can not set the priority to the default method (main) It is the highest priority by default.
////        We can give the priority to the created thread but that is not 100% surety
//        thread.start();
//        System.out.println(Thread.activeCount());

//        ============================== Infinite Time ====================================================

//        Thread thread=new Thread(new InfiniteTime(),"First Thread");
//        thread.setPriority(9);
//        Thread thread1=new Thread(new InfiniteTime(),"Second Thread");
//        thread1.setPriority(2);
//        thread.start() ;
//        thread1.start();

//        ================================= Multiple Thread ======================================================

//        Thread thread=new Thread(new ThreadOneClass(),"Thread One Class");
//        Thread thread1=new Thread(new ThreadTwoClass(),"Thread two Class");
//        Thread thread2=new Thread(new ThreadPrime(),"Thread Prime");
//        thread.setPriority(10);
//        thread1.setPriority(2);
//        thread2.setPriority(8);
//        thread.start();
//        thread1.start();
//        thread2.start();

//        ===================================== Random Number =====================================================

        Thread thread=new Thread(new ThreadRandom(),"Thread Random");
        thread.start();

    }
}