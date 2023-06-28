package StarPracticeProgram;

public class NumberReverseRightAngle extends PracticeProgram  {
    public void practiceProgram(int number) {
        for(int row=0;row<=number;row++){
            for(int column=number;column>=row;column--){
                System.out.print(column+ " ");
            }
            System.out.println();

        }

    }
}
