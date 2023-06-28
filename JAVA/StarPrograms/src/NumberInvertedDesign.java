public class NumberInvertedDesign extends StarPattern {
    public int starpattern(int number1) {

        for (int row = number1 - 1; row >= 1; row--) {
            //Printing i spaces at the beginning of each row

            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            //Printing i to rows value at the end of each row

            for (int column = row; column <= number1; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
        return 0;
    }
}
