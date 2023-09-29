
 
 -- (25)List the rental date and return date for all rentals made by 
 -- customer "Susan Johnson".
    select* from customer
	select* from rental 
    
	select rental_date,return_date from rental join customer 
    on customer.customer_id=rental.customer_id where first_name='CHARLOTTE' and
    last_name='HUNTER'
 
