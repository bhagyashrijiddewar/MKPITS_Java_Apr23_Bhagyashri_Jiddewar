package StarPracticeProgram;

public class SpaceStarReverseRightAngle extends PracticeProgram {
    public void practiceProgram(int number) {

        for (int row = 1; row <= number; row++) {
            for(int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for (int star = number; star >= row; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
