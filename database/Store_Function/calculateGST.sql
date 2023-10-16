-- Problem Statement 2: 
-- Calculate Age from Birthdate
-- Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.

select* from store
drop function totalAmount

DELIMITER //

CREATE FUNCTION totalAmountWithGst(amt decimal(5,2)) 
RETURNS decimal(5,2)
DETERMINISTIC
BEGIN
    DECLARE gst int;
  
END//
DELIMITER ;

select payment_id,Amount,totalAmountWithGst(amount) as GST,amount+totalAmountWithGst(amount) as Total from payment
