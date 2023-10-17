
-- Assignment 2: Find films rented by a specific customer:
-- Retrieve the titles of films rented by a customer with a given customer_id.

select* from customer
select* from film
select* from rental
 
 select title from film where film_id in (select film_id from inventory where
 inventory_id in (select inventory_id from rental where customer_id in 
 (select customer_id from customer where customer_id=1)))
 
 
