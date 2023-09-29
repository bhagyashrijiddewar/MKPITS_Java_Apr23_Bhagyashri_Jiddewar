
 
 -- (40) Retrieve the rental date and return date for each rental made by
 -- customer "Lisa Anderson".
select*from film
select* from inventory
select*from rental
select* from customer

	select rental_date,return_date from rental join customer 
    on customer.customer_id=rental.customer_id where first_name='Lisa' and
    last_name='Anderson'
    