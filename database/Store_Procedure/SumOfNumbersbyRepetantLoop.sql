use sakila
 
 -- (1)  Sum of the number system by using repetant
 drop procedure SumOfTenNumbers
   -- ============ create a store procedure ============
   Delimiter //
   create procedure SumOfTenNumbers(n int)
begin
   declare i int ; 
   declare number1 int ; 
   set number1=1;
   set i=1;
   
   repeat
   set number1=number1+i; -- (number1=2,i=1),(number1=2+2=4,i=2),(number1=4+3=7,i=3),(number1=7+4=11,i=4),(number1=11+5=16,i=5)
   set i=i+1; -- 2,3,4,5,6
    -- whenever the condition true the loop stop
    until i>n -- 2-false (continue) ,3-false (continue) ,4-false (continue) ,5-false (continue) ,6-true (stop loop)
    end repeat;
      select number1;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call SumOfTenNumbers(5)
    
  
  

  
  