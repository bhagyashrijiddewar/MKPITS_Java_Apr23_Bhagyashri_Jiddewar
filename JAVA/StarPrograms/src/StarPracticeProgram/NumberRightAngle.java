package StarPracticeProgram;

public class NumberRightAngle extends PracticeProgram {
    public void practiceProgram(int number){
        for(int row=0;row<=number;row++){
            for(int column=0;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
