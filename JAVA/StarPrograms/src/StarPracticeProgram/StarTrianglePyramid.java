package StarPracticeProgram;

public class StarTrianglePyramid extends PracticeProgram{
    public void practiceProgram(int number){

        for(int row=1;row<=number;row++){
            for(int space=number;space>=row;space--){
                System.out.print(" ");
            }
            //-----if we want to run this program by using commented code then comment below code and uncomment commented code---
//            for(int star=1;star<(row*2);star++){
//                System.out.print("*");
//            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            for(int spaceOuter=2;spaceOuter<=row;spaceOuter++){
                System.out.print("*");
            }
            System.out.println();

            }
        }
    }
