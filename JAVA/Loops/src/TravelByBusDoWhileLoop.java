public class TravelByBusDoWhileLoop {
    public static void main(String[] args) {

        int Every15minutesBusStation=15;
        int numberOfStation=1;
        do{
            System.out.println("Bus at the station "+numberOfStation);
            numberOfStation++;
            Every15minutesBusStation+=15;

        }while (Every15minutesBusStation<90);
        System.out.println("Reached final station.");
    }
}
