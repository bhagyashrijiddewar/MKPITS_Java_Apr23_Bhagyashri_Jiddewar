package OddNumberByNonStaticMethod;

public class PrintOddNumber {
    public  void displayOddNumber() {
        int number = 1;
        System.out.println("Odd number by using non-static method : ");
        while (number < 100) {
            if (number % 2 == 1)
                System.out.print(number + " ");
            number++;
        }
    }
}
