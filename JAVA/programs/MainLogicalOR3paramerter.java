 class MainLogicalOR3paramerter{

public static void main(String[] args){
	//======================================================Logical OR operator of 3 parameters=====================================================

     LogicalOR3Parameter logicalOR=new LogicalOR3Parameter();
	 System.out.println( "Logical AND 3-parameters: true || true || true "+ " = " + logicalOR.logicalOR3Var(true,true,true));
	 
	 System.out.println( "Logical AND 3-parameters: true || false || true"+ " = " + logicalOR.logicalOR3Var(true,false,true));
	 
	 System.out.println( "Logical AND 3-parameters: true || true || false "+ " = " + logicalOR.logicalOR3Var(true,true,false));

	 System.out.println( "Logical AND 3-parameters: true || false || false "+ " = " + logicalOR.logicalOR3Var(true,false,false));

	 System.out.println( "Logical AND 3-parameters: false || false || false "+ " = " + logicalOR.logicalOR3Var(false,false,false));
	 
	 System.out.println( "Logical AND 3-parameters: false || true || false "+ " = " + logicalOR.logicalOR3Var(false,true,false));
	 
	 System.out.println( "Logical AND 3-parameters: false || false|| true "+ " = " + logicalOR.logicalOR3Var(false,false,true));
	 
	 System.out.println( "Logical AND 3-parameters: false|| true || true "+ " = " + logicalOR.logicalOR3Var(false,true,true));
	 
	  
}
}