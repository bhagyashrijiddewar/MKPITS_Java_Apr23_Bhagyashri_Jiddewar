use sakila
 
 -- (1)  Factorial by while loop
 drop procedure factorialByrepetant
   -- ============ create a store procedure ============
   Delimiter //
   create procedure factorialByrepetant(n int)
begin
   declare i int ; 
   declare number1 int ; 
   set number1=1;
   set i=1;
   
   repeat  
   set number1=number1*i;
   set i=i+1;
   until i>n
    end repeat;
      select number1;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call factorialByrepetant(5)
    
  
  

  
  