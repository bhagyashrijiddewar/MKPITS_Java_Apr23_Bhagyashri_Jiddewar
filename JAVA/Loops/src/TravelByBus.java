public class TravelByBus {
    public static void main(String[] args) {

         boolean isBusTicket = true;
         int stagesComplete=1;
        do{
            System.out.println("We can enter into the Bus");
            if(stagesComplete<2){
                stagesComplete++;
            }
        }while (!isBusTicket);
    }
}
