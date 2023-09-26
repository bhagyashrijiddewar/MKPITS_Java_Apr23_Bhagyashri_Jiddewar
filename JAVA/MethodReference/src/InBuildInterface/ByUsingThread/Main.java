package InBuildInterface.ByUsingThread;

public class Main {
    public static void main(String[] args) {

        Runnable runnable = MethodReferenceByUsingThread::displayOddNumber;
        Thread thread = new Thread(runnable);
        thread.start();

    }
}