
-- Problem Statement 3: 
-- Identify Inactive Customers
-- Develop a stored procedure that identifies inactive customers who haven't made any rentals in the last six months. 
-- The procedure should output a list of these customers along with their contact information.

select* from rental
select* from payment 

Delimiter //
create procedure generateReceipt(rentalid int)
begin
 select rental.rental_id,first_name,last_name,customer.customer_id,rental_date,return_date,sum(amount) as 'Total cost'
 from rental join payment on payment.rental_id=rental.rental_id join
 customer on customer.customer_id=payment.customer_id 
 where rental.rental_id=rentalid;

end //
Delimiter ;

call  generateReceipt(1);
