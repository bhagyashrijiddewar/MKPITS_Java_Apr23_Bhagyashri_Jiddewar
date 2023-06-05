 class MainLogicalOR2paramerter{

public static void main(String[] args){
	//======================================================Logical OR operator of 2 parameters=====================================================

     LogicalOR2Parameter logicalOR=new LogicalOR2Parameter();
	 
	 System.out.println( "Logical OR 2-parameters: true || true "+ " = " + logicalOR.logicalOR2Var(true,true));
	 
	 System.out.println( "Logical OR 2-parameters: true||false "+ " = " + logicalOR.logicalOR2Var(true,false));
	 
	 System.out.println( "Logical OR 2-parameters: false|| true "+ " = " + logicalOR.logicalOR2Var(false,true));
	 
	 System.out.println( "Logical OR 2-parameters: false||false "+ " = " + logicalOR.logicalOR2Var(false,false));

	  
}
}