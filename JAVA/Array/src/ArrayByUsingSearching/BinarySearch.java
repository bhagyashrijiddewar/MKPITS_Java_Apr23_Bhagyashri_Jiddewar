package ArrayByUsingSearching;

public class BinarySearch {
    int array[]={1,2,3,4,5,6,7,8,9};
     boolean status;
    public boolean isFoundMethod(int number){
        int minValue=0;
        int maxValue=9;
        int midValue;
         for(midValue=(minValue+maxValue)/2;midValue<=maxValue;midValue=(minValue+maxValue)/2){
             if(number==array[midValue]){
                 status=true;
                 return status;
             }
             if(number>array[midValue]){
                 minValue=midValue+1;
             }
            else {
                 maxValue = midValue - 1;
             }
         }
         return status;
    }
}
