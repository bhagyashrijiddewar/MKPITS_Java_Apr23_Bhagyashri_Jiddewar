public class Main {
    public static void main(String[] args) {
        Addition add=new Addition();
        add.setNumber1(5);
        add.setNumber2(6);

        int sum = add.getNumber1() + add.getNumber2();
        int sum2 = add.Myadd();

        System.out.println(sum);
        System.out.println(add.Myadd());
        System.out.println(sum2);

    }
}