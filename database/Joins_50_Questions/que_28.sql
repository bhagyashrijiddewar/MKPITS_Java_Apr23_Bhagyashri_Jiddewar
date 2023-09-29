
 
 -- (28) Retrieve the rental date and rental duration for each rental made by 
 -- customer "Joseph Brown".
    select* from customer 
	select* from rental 
    select* from inventory
    select* from film
    
	select rental_date,rental_duration from film join inventory
    on inventory.film_id=film.film_id join rental on
    rental.inventory_id=inventory.inventory_id join customer on
    customer.customer_id=rental.customer_id 
    where customer.first_name='Joseph' and customer.last_name='Brown'
 
