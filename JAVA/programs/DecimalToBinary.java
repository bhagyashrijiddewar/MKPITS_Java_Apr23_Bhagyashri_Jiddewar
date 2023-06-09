class DecimalToBinary{

public int toBinary(int decimal){
 int binaryNumber = 0;
 int remainder, i = 1, step = 1;

    while (decimal!=0) {
      remainder = decimal % 2;
        System.out.println("Step " + step++ + ": " + decimal + "/2");

        System.out.println("Quotient = " + decimal/2 + ", Remainder = " + remainder);
        decimal /= 2;

        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }

public static void main (String[] args){
	int number=10;
	DecimalToBinary binary=new DecimalToBinary();
	int binaryValue=binary.toBinary(number);
	System.out.println("Binary value of decimal number "+ number +" is : "+binaryValue);
	
}

}



