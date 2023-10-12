use sakila
 
 -- (1)  Find the factorial of 10
 
   -- ============ create a store procedure ============
   Delimiter //
   create procedure factorial3(n int)

   begin
   declare  number1 int;
   declare i int ; 
   set number1=1;
   set i=1;
   
   ForLoop: loop
   set number1=number1*i;
   set i=i+1;
   
    if i>n then
         leave ForLoop; 
    end if;
    end loop ForLoop;
      select number1;
    end
  //
  delimiter ;
  -- ============ call store procedure =================
  call factorial3(5)
    
  
  

  
  