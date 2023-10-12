use sakila
 
 -- (1)  Sum of the number system by using while loop
 drop procedure SumOfTenNumbersbyWhileLoop
   -- ============ create a store procedure ============
   Delimiter //
   create procedure SumOfTenNumbersbyWhileLoop(n int)
begin
   declare i int ; 
   declare number1 int ; 
   set number1=1;
   set i=1;
   
   while i<=n do 
   set number1=number1+i; -- (number1=2,i=1),(number1=2+2=4,i=2),(number1=4+3=7,i=3),(number1=7+4=11,i=4),(number1=11+5=16,i=5)
   set i=i+1; -- 2,3,4,5,6
    end while;
      select number1;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call SumOfTenNumbersbyWhileLoop(5)
    
  
  

  
  