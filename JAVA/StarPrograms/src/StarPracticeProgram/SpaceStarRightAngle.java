package StarPracticeProgram;

public class SpaceStarRightAngle extends PracticeProgram {
    public void practiceProgram(int number){

        for(int row=1;row<=number;row++){
            for(int space=number;space>=row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
