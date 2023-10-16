
drop function totalAmount
DELIMITER //

CREATE FUNCTION totalAmount(cust_id int) 
RETURNS int
DETERMINISTIC
BEGIN
    DECLARE amt int;
    select sum(amount) into amt  from payment where customer_id=cust_id;
    
	-- return the customer level
	RETURN (amt);
END//
DELIMITER ;

select totalAmount(1)


select* from payment