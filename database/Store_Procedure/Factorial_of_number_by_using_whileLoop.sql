use sakila
 
 -- (1)  Factorial by while loop
 drop procedure factorialByWhile1
   -- ============ create a store procedure ============
   Delimiter //
   create procedure factorialByWhile1(n int)
begin
   declare i int ; 
   declare number1 int ; 
   set number1=1;
   set i=1;
   
   while i<=n do
   set number1=number1*i;
   set i=i+1;
    end while;
      select number1;
end
  //
  delimiter ;
  -- ============ call store procedure =================
  call factorialByWhile1(5)
    
  
  

  
  