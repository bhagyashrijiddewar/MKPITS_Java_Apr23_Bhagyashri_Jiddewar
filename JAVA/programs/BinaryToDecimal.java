class BinaryToDecimal{

public long toDecimal(long binary){
 int decimalNumber = 0;
 long remainder, i = 1;
 
    while (binary != 0) {
      remainder = binary % 10;
      binary /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
    }

public static void main (String[] args){
	long number=1101101;
	BinaryToDecimal decimal=new BinaryToDecimal();
	long decimalValue=decimal.toDecimal(number);
	System.out.println("decimal value of binary number "+ number +" is : "+decimalValue);
	
}

}