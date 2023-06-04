 class MainLogicalAnd{

public static void main(String[] args){
	//======================================================Logical AND operator of two variables======================================================

     LogicalAnd2Variable logicaland=new LogicalAnd2Variable();
	 System.out.println( "Logical AND 2-parameters: true && true "+ " = " + logicaland.logicalAnd2Var(true,true));
	 
	 System.out.println( "Logical AND 2-parameters: true && false "+ " = " + logicaland.logicalAnd2Var(true,false));

	 System.out.println( "Logical AND 2-parameters: false && true "+ " = " + logicaland.logicalAnd2Var(false,true));

	 System.out.println( "Logical AND 2-parameters: false && false "+ " = " + logicaland.logicalAnd2Var(false,false));

	

	  
}
}