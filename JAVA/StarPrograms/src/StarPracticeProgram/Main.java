package StarPracticeProgram;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        System.out.println("Enter the number for incremental diagram :");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        //====================== 1 ===========================
        System.out.println("================= 1 ====================");
        NumberRightAngle numberRightAngle=new NumberRightAngle();
        numberRightAngle.practiceProgram(number);

        //======================= 2 ===========================
        System.out.println("================= 2 ===================");
        NumberReverseRightAngle numberReverseRightAngle=new NumberReverseRightAngle();
        numberReverseRightAngle.practiceProgram(number);

        //======================= 3 ===========================
        System.out.println("=============== 3 ===================");
        SpaceStarRightAngle spaceStarRightAngle=new SpaceStarRightAngle();
        spaceStarRightAngle.practiceProgram(number);

        //======================= 4 ===========================
        System.out.println("=============== 4 ===================");
        SpaceStarReverseRightAngle spaceStarReverseRightAngle=new SpaceStarReverseRightAngle();
        spaceStarReverseRightAngle.practiceProgram(number);

        //======================= 5 ===========================
        System.out.println("=============== 5. Merge SpaceStarReverseRightAngle and SpaceStarRightAngle ===================");
        SpaceStarRightAngle spaceStarRightAngle1=new SpaceStarRightAngle();
        spaceStarRightAngle1.practiceProgram(number);
        SpaceStarReverseRightAngle spaceStarReverseRightAngle1=new SpaceStarReverseRightAngle();
        spaceStarReverseRightAngle1.practiceProgram(number);

        //======================= 4 ===========================
        System.out.println("=============== 4 ===================");


    }
}
