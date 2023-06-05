 class MainLogicalNotOR{

public static void main(String[] args){
	//======================================================Logical Not operator of 2- parameter======================================================

     LogicalNotParameter logicalnot=new LogicalNotParameter();
	 System.out.println( "Logical Not 2-parameters: true || true "+ " = " + logicalnot.logicalNot2VarAndOperator(true,true));
	 
	 System.out.println( "Logical Not 2-parameters: true || false "+ " = " + logicalnot.logicalNot2VarAndOperator(true,false));

	 System.out.println( "Logical Not 2-parameters: false || true "+ " = " + logicalnot.logicalNot2VarAndOperator(false,true));

	 System.out.println( "Logical Not 2-parameters: false || false "+ " = " + logicalnot.logicalNot2VarAndOperator(false,false));
	 
	//======================================================Logical Not operator of 3- parameter======================================================

	 
	 System.out.println( "Logical Not 3-parameters: true || true || true "+ " = " + logicalnot.logicalNot3VarAndOperator(true,true,true));
	 
	 System.out.println( "Logical Not 3-parameters: true || false || true"+ " = " + logicalnot.logicalNot3VarAndOperator(true,false,true));
	 
	 System.out.println( "Logical Not 3-parameters: true || true || false "+ " = " + logicalnot.logicalNot3VarAndOperator(true,true,false));

	 System.out.println( "Logical Not 3-parameters: true || false || false "+ " = " + logicalnot.logicalNot3VarAndOperator(true,false,false));

	 System.out.println( "Logical Not 3-parameters: false || false || false "+ " = " + logicalnot.logicalNot3VarAndOperator(false,false,false));
	 
	 System.out.println( "Logical Not 3-parameters: false || true || false "+ " = " + logicalnot.logicalNot3VarAndOperator(false,true,false));
	 
	 System.out.println( "Logical Not 3-parameters: false || false|| true "+ " = " + logicalnot.logicalNot3VarAndOperator(false,false,true));
	 
	 System.out.println( "Logical Not 3-parameters: false || true || true "+ " = " + logicalnot.logicalNot3VarAndOperator(false,true,true));

	//======================================================Logical Not operator of 4- parameter======================================================

	 System.out.println( "Logical Not 4-parameters: true && true && true && true "+ " = " + logicalnot.logicalNot4VarAndOperator(true,true,true,true));
	 
	 System.out.println( "Logical Not 4-parameters: true && false &&true &&true "+ " = " + logicalnot.logicalNot4VarAndOperator(true,false,true,true));
	 
	 System.out.println( "Logical Not 4-parameters: true && true && false&& true  "+ " = " + logicalnot.logicalNot4VarAndOperator(true,true,false,true));
	 
	 System.out.println( "Logical Not 4-parameters: true &&true && true && false  "+ " = " + logicalnot.logicalNot4VarAndOperator(true,true,true,false));

	 System.out.println( "Logical Not 4-parameters: true &&false && false && true "+ " = " + logicalnot.logicalNot4VarAndOperator(true,false,false,true));

	 System.out.println( "Logical Not 4-parameters: true &&true &&false && false "+ " = " + logicalnot.logicalNot4VarAndOperator(true,true,false,false));
	 
	 System.out.println( "Logical Not 4-parameters: false && false && false &&false"+ " = " + logicalnot.logicalNot4VarAndOperator(false,false,false,false));
	 
	 System.out.println( "Logical Not 4-parameters: false && true && false && false"+ " = " + logicalnot.logicalNot4VarAndOperator(false,true,false,false));
	 
	 System.out.println( "Logical Not 4-parameters: false && false && true && false "+ " = " + logicalnot.logicalNot4VarAndOperator(false,false,true,false));
	 
	 System.out.println( "Logical Not 4-parameters: false && false && false && true "+ " = " + logicalnot.logicalNot4VarAndOperator(false,false,false,true));

	 System.out.println( "Logical Not 4-parameters: false &&  true && true &&false"+ " = " + logicalnot.logicalNot4VarAndOperator(false,true,true,false));
	 
	 System.out.println( "Logical Not 4-parameters: false && false &&false &&false "+ " = " + logicalnot.logicalNot4VarAndOperator(false,false,true,true));

 	//======================================================Logical Not operator of 5- parameter======================================================

}
}