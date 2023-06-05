 class LogicalNotParameter{
	
//============Logical not for 2/3/4/5 parameters in logical AND operator===========	

public boolean logicalNot2VarAndOperator(boolean number1, boolean number2){
	return !(number1 && number2);
}
public boolean logicalNot3VarAndOperator(boolean number1, boolean number2, boolean number3){
	return !(number1 && number2 && number3);
}
public boolean logicalNot4VarAndOperator(boolean number1, boolean number2, boolean number3, boolean number4){
	return !(number1 && number2 && number3 && number4);
}
public boolean logicalNot5VarAndOperator(boolean number1, boolean number2, boolean number3, boolean number4, boolean number5){
	return !(number1 && number2 && number3 && number4 && number5);
}



}