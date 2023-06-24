public class ElseifStatment {
    String string;
    public String elseif(int number1,int number2,int number3) {
        if (number1 > number2) {
            System.out.println(" " + number1 + " is greater than " + number2 + " ");

        }
        else if(number2 > number3) {
            System.out.println(" " + number2 + " is greater than " + number3 + "");
        }
        else if(number3 > number1) {
            System.out.println(" " + number3 + " is greater than " + number1 + "");
        }

        else {
            System.out.println(" None of the condition is true");
        }
        return string;
    }

    }

