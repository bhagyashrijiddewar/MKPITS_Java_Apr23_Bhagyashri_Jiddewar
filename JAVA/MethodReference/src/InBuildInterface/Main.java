package InBuildInterface;

public class Main {
    public static void main(String[] args) {
        Runnable runnable=MyClass::displayOddNumber;
        runnable.run();
    }
}

