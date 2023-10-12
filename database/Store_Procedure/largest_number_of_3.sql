use sakila
 
 -- (1)  take a number and find out the largest numner
 
   -- ============ create a store procedure ============
   Delimiter //
   create procedure largest_Number1(in number1 int,in number2 int,in number3 int)

   begin
    if number1>number2 then
    
      if number1>number3 then
      select number1;
      else
      select number2;
      
      end if;
      else
      
      if number2>number3 then 
      select number2;
      else 
      select number3;
      
      end if;
      end if;
    end
  //
  delimiter ;
  
  -- ============ call store procedure =================
  call largest_Number1(5,8,50)
    
  
  

  
  