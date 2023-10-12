use sakila
 
 -- (1)  print the number 1 to 10 by using for loop
 
   -- ============ create a store procedure ============
   Delimiter //
   create procedure LoopQuery()

   begin
   declare  number1 int ; 
   set number1=0;
   
   ForLoop: loop
   set number1=number1+1;
   select number1;
    if number1>=10 then
         leave ForLoop; 
    end if;
    end loop ForLoop;
      
    end
  //
  delimiter ;
  
  -- ============ call store procedure =================
  call LoopQuery()
    
  
  

  
  