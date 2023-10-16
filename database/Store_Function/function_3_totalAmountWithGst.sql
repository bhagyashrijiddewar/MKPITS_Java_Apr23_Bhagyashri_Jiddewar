
drop function totalAmount
DELIMITER //

CREATE FUNCTION totalAmountWithGst(amt decimal(5,2)) 
RETURNS decimal(5,2)
DETERMINISTIC
BEGIN
    DECLARE gst int;
    set gst=amt*0.18;
	-- return the customer level
	RETURN gst;
END//
DELIMITER ;

select totalAmountWithGst(45.45)

select payment_id,Amount,totalAmountWithGst(amount) as GST,amount+totalAmountWithGst(amount) as Total from payment
