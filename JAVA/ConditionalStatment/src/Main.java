public class Main {
    public static void main(String[] args) {

        IfElseStament ifElseStament=new IfElseStament();
        System.out.println( ifElseStament.iflse(30,20,10));

        ElseifStatment elseifStatment=new ElseifStatment();
        elseifStatment.elseif(6,8,5);

        SwitchStatment switchStatment=new SwitchStatment();
        System.out.println("Display the day: "+ switchStatment.switchStatment("5"));

        IfLadderStatment ifLadderStatment=new IfLadderStatment();
        ifLadderStatment.ifLadder(40,30);
    }
}