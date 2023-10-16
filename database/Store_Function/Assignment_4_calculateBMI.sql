-- Problem Statement 4:
--  Calculate BMI (Body Mass Index)
-- Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as input and calculates their BMI.

drop function calculateBMI

DELIMITER //
CREATE FUNCTION calculateBMI(weight decimal(5,2),height decimal(5,2)) 
RETURNS decimal(5,2)
DETERMINISTIC
BEGIN
  return weight/height;
END//
DELIMITER ;

select calculateBMI(45.45,5.4)