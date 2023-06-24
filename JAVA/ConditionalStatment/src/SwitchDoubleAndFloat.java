public class SwitchDoubleAndFloat {
    public void SwitchDoubleFloat(double number){
//Incompatible types. Found: 'float'and 'double' required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'.
// If we want to use float and double datatype, we can use type-casting method to convert the value into integer.
//        switch (number){
          switch ((int) number){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thirsday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Satarday");
                break;
            default:
                System.out.println("Default value");
        }
    }
}
