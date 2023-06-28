package StarPracticeProgram;

public class StarTriangleReversePyramid extends PracticeProgram {
    public void practiceProgram(int number) {

        for (int row = 1; row <= number; row++) {
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(int star=number;star>row;star--){
                System.out.print("*");
            }
            for(int starAgain=number;starAgain>=row;starAgain--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
