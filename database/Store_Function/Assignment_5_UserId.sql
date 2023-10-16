-- Problem Statement 5:
-- Problem Statement 5: Generate a Unique Customer ID
-- Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customer's personal details.

drop function generateUserID

DELIMITER //
CREATE FUNCTION generateUserID(first_name varchar(15),mobileNumber varchar(13)) 
RETURNS varchar(8)
DETERMINISTIC
BEGIN
declare uniqueID varchar(8);
  return concat (substring(first_name, 1, 3), substring(mobileNumber, 1, 3),substring(first_name, 5, 2));
END//
DELIMITER ;

select generateUserID('Bhagyashri','8275297187')