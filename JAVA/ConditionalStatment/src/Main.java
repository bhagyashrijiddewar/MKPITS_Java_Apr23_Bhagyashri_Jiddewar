public class Main {
    public static void main(String[] args) {
        //--------------If Else Statement------------------------
        System.out.println("--------------If Else Statement------------------------");
        IfElseStament ifElseStament=new IfElseStament();
        ifElseStament.iflse(5,20,10);

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

        //-------------- Switch Byte Statement------------------------
        System.out.println("------------- Switch Byte Statement------------------------");
        SwitchByte switchByte=new SwitchByte();
        switchByte.switchbyte((byte) 5);

        //--------------Default  Switch  Statement------------------------
        System.out.println("-------------Default Switch Statement------------------------");
        SwitchDefault switchDefault=new SwitchDefault();
        switchDefault.switchdefault( 2);

        //-------------- Switch Default swapping Statement------------------------
        System.out.println("-------------Switch Default swapping Statement------------------------");
        SwitchDefaultSwapping switchDefaultSwapping=new SwitchDefaultSwapping();
        //switchDefaultSwapping.switchSwapping(0);
        switchDefaultSwapping.switchSwapping(6);

        //-------------- Switch Double and float  Statement------------------------
        System.out.println("-------------Switch Double and float   Statement------------------------");
        SwitchDoubleAndFloat switchDoubleAndFloat=new SwitchDoubleAndFloat();
        switchDoubleAndFloat.SwitchDoubleFloat(2);
    }
}