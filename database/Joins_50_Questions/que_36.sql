
 
 -- (36) Retrieve the film titles and rental dates for all rentals made by the 
 -- customer with customer_id 900.
select*from film
select* from inventory
select*from rental
select* from customer
select title,rental_date from film join inventory on inventory.film_id=film.film_id join rental on 
rental.inventory_id=inventory.inventory_id join customer on 
rental.customer_id=customer.customer_id where customer.customer_id=900
    