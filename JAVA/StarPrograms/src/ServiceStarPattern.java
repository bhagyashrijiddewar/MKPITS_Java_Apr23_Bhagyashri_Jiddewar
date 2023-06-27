public class ServiceStarPattern {
public int serviceStarPattern(int pattern,int number){
    switch (pattern){

        case 3:
            StarInvertedTriangle starInvertedTriangle=new StarInvertedTriangle();
            int triangle1=starInvertedTriangle.starpattern(number);
            return triangle1;
        case 4:

            MeargeStarRightAngle meargeStarRightAngle=new MeargeStarRightAngle();
            int rightangle=meargeStarRightAngle.starpattern(number);
            MeargeStarInvertedRightAngle meargeStarInvertedRightAngle =new MeargeStarInvertedRightAngle();
            int mergeRightAngle= meargeStarInvertedRightAngle.starpattern(number);
            break;

        case 5:
            StarTriangle starTriangle=new StarTriangle();
            int triangle= starTriangle.starpattern(number);
            StarInvertedTriangle starReverseTriangle=new StarInvertedTriangle();
            int invertedTriangle=starReverseTriangle.starpattern(number);
            break;
        case 6:
            StarRightAngle RightAngle=new StarRightAngle();
           int rightAngle= RightAngle.starpattern(number);
           return rightAngle;
        case 7:
            StarReverseRightAngle starRightAngle=new StarReverseRightAngle();
            int reversRightAngle=starRightAngle.starpattern(number);
            return reversRightAngle;
    }
    return 0;
}
}
