public class SwitchByte {
    public void switchbyte(byte number){
        switch (number){
            case (byte) 1:
                System.out.println("Sunday");
                break;
            case (byte)2:
                System.out.println("Monday");
                break;
            case (byte)3:
                System.out.println("Tuesday");
                break;
            case (byte)4:
                System.out.println("Wednesday");
                break;
            case (byte)5:
                System.out.println("Thirsday");
                break;
            case (byte)6:
                System.out.println("Friday");
                break;
            case (byte)7:
                System.out.println("Satarday");
                break;
            default:
                System.out.println("Default value");

        }
    }
}
