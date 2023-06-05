 class MainLogicalAnd4paramerter{

public static void main(String[] args){
	//======================================================Logical AND operator of 4 parameters=====================================================

     LogicalAnd4Parameter logicaland=new LogicalAnd4Parameter();
	 System.out.println( "Logical AND 4-parameters: true && true "+ " = " + logicaland.logicalAnd4Var(true,true,true,true));
	 
	 System.out.println( "Logical AND 4-parameters: true && false "+ " = " + logicaland.logicalAnd4Var(true,false,true,true));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(true,true,false,true));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(true,true,true,false));

	 System.out.println( "Logical AND 4-parameters: false && true "+ " = " + logicaland.logicalAnd4Var(true,false,false,true));

	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(true,true,false,false));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,false,false,false));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,true,false,false));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,false,true,false));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,false,false,true));

	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,true,true,false));
	 
	 System.out.println( "Logical AND 4-parameters: false && false "+ " = " + logicaland.logicalAnd4Var(false,false,true,true));
	 



	

	  
}
}