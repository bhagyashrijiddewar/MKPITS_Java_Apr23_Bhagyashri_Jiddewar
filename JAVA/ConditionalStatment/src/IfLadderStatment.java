public class IfLadderStatment {

    public void ifLadder(int number1,int number2) {
        if (number1>number2 && number2<number1) {
            System.out.println("Candidate not eligible for votting.");
        }
        if (number1==number2) {
            System.out.println("number1 is equals to number2");
        }
        if (number1<number2) {
            System.out.println("number2 is greater than number1");
        }
        if (number1>number2) {
            System.out.println("number2 is greater than number1");
        }
    }
}
