public class Main {
    public static void main(String[] args) {
        Addition1 add=new Addition1();
        add.setNumber1(5);
        add.setNumber2(9);
       int sum1= add.getSum();

        System.out.println("Addition of 2-numbers: "+sum1);
    }
}