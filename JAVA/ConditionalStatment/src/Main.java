public class Main {
    public static void main(String[] args) {
        //--------------If Else Statement------------------------
        System.out.println("--------------If Else Statement------------------------");
        IfElseStament ifElseStament=new IfElseStament();
        ifElseStament.iflse(30,20,10);

        //-------------- Else If Statement------------------------
        System.out.println("-------------- Else if Statement------------------------");
        ElseifStatment elseifStatment=new ElseifStatment();
        elseifStatment.elseif(6,8,5);

        //--------------Switch Statement------------------------
        System.out.println("-------------Switch Statement------------------------");
        SwitchStatment switchStatment=new SwitchStatment();
        System.out.println("Display the day: "+ switchStatment.switchStatment("6"));

        //--------------If Ladder Statement------------------------
        System.out.println("--------------If Ladder Statement------------------------");
        IfLadderStatment ifLadderStatment=new IfLadderStatment();
        ifLadderStatment.ifLadder(40,30);
    }
}