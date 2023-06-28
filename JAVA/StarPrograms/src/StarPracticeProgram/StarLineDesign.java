package StarPracticeProgram;

public class StarLineDesign extends PracticeProgram{
    public void practiceProgram(int number){

        for(int row=1;row<=number;row++) {
            for(int star=1;star<=row;star++){
                if(row>=2 && star<=(row-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
