public class ServiceStarPattern {
public int serviceStarPattern(int pattern,int number){
    switch (pattern){
        case 1:
            System.out.println("==================Inverted Triangle===================== ");
            StarInvertedTriangle starInvertedTriangle=new StarInvertedTriangle();
            starInvertedTriangle.starpattern(number);
            break;
        case 2:
            MeargeStarRightAngle meargeStarRightAngle=new MeargeStarRightAngle();
            meargeStarRightAngle.starpattern(number);
            MeargeStarInvertedRightAngle meargeStarInvertedRightAngle =new MeargeStarInvertedRightAngle();
            meargeStarInvertedRightAngle.starpattern(number);
            break;
        case 3:
            StarTriangle starTriangle=new StarTriangle();
            starTriangle.starpattern(number);
            StarInvertedTriangle starReverseTriangle=new StarInvertedTriangle();
            starReverseTriangle.starpattern(number);
            break;
        case 4:
            StarRightAngle RightAngle=new StarRightAngle();
            RightAngle.starpattern(number);
            break;
        case 5:
            StarReverseRightAngle starRightAngle=new StarReverseRightAngle();
            starRightAngle.starpattern(number);
            break;
        case 6:
            StarTriangle starTriangleSingle=new StarTriangle();
            starTriangleSingle.starpattern(number);
            break;
        case 7:
            StarInvertedTriangle starReverseTriangleMerge=new StarInvertedTriangle();
            starReverseTriangleMerge.starpattern(number);
            StarTriangle starTriangleMerge=new StarTriangle();
            starTriangleMerge.starpattern(number);
            break;
        case 8:
            NumberDesign numberDesign=new NumberDesign();
            numberDesign.starpattern(number);
            NumberInvertedDesign numberInvertedDesign=new NumberInvertedDesign();
            numberInvertedDesign.starpattern(number);

    }
    return 0;
}
}
