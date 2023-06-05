 class MainLogicalOR4paramerter{

public static void main(String[] args){
	//======================================================Logical OR operator of 4 parameters=====================================================

     LogicalAnd4Parameter logicaland=new LogicalAnd4Parameter();
	 System.out.println( "Logical OR 4-parameters: true || true ||trur||true "+ " = " + logicaland.logicalAnd4Var(true,true,true,true));
	 
	 System.out.println( "Logical OR 4-parameters: true||false||true||true "+ " = " + logicaland.logicalAnd4Var(true,false,true,true));
	 
	 System.out.println( "Logical OR 4-parameters: true||false||true||true "+ " = " + logicaland.logicalAnd4Var(true,true,false,true));
	 
	 System.out.println( "Logical OR 4-parameters: true||true||true||false "+ " = " + logicaland.logicalAnd4Var(true,true,true,false));

	 System.out.println( "Logical OR 4-parameters: true||false||false||true "+ " = " + logicaland.logicalAnd4Var(true,false,false,true));

	 System.out.println( "Logical OR 4-parameters: true||true||false||false "+ " = " + logicaland.logicalAnd4Var(true,true,false,false));
	 
	 System.out.println( "Logical OR 4-parameters: false||false||false||false "+ " = " + logicaland.logicalAnd4Var(false,false,false,false));
	 
	 System.out.println( "Logical OR 4-parameters: false||true||false||false "+ " = " + logicaland.logicalAnd4Var(false,true,false,false));
	 
	 System.out.println( "Logical OR 4-parameters: false||false||true||false "+ " = " + logicaland.logicalAnd4Var(false,false,true,false));
	 
	 System.out.println( "Logical OR 4-parameters: false||false||false||true "+ " = " + logicaland.logicalAnd4Var(false,false,false,true));

	 System.out.println( "Logical OR 4-parameters: false||true||true||false "+ " = " + logicaland.logicalAnd4Var(false,true,true,false));
	 
	 System.out.println( "Logical OR 4-parameters: false||false||true||true "+ " = " + logicaland.logicalAnd4Var(false,false,true,true));
	 



	

	  
}
}