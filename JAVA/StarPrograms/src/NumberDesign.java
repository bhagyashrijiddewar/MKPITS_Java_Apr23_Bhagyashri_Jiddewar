public class NumberDesign extends StarPattern {

    public int starpattern(int number1) {
        for(int row=1;row<=number1;row++){

            for(int space=1;space<=row;space++) {
                System.out.print(" ");
            }
            for (int column = row; column <= number1; column++)
            {
                System.out.print(column+" ");
            }
            System.out.println();
        }
        return 0;
    }
 }




