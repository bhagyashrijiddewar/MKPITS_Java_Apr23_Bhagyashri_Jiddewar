 class MainLogicalAnd3paramerter{

public static void main(String[] args){
	//======================================================Logical AND operator of 3 parameters=====================================================

     LogicalAnd3Parameter logicaland=new LogicalAnd3Parameter();
	 System.out.println( "Logical AND 3-parameters: true && true && true "+ " = " + logicaland.logicalAnd3Var(true,true,true));
	 
	 System.out.println( "Logical AND 3-parameters: true && false && true"+ " = " + logicaland.logicalAnd3Var(true,false,true));
	 
	 System.out.println( "Logical AND 3-parameters: true && true && false "+ " = " + logicaland.logicalAnd3Var(true,true,false));

	 System.out.println( "Logical AND 3-parameters: true && false && false "+ " = " + logicaland.logicalAnd3Var(true,false,false));

	 System.out.println( "Logical AND 3-parameters: false && false && false "+ " = " + logicaland.logicalAnd3Var(false,false,false));
	 
	 System.out.println( "Logical AND 3-parameters: false && true && false "+ " = " + logicaland.logicalAnd3Var(false,true,false));
	 
	 System.out.println( "Logical AND 3-parameters: false && false&& true "+ " = " + logicaland.logicalAnd3Var(false,false,true));
	 
	 System.out.println( "Logical AND 3-parameters: false && true && true "+ " = " + logicaland.logicalAnd3Var(false,true,true));


	

	  
}
}