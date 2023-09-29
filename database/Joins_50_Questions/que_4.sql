//-question (4) Get the titles of all films rented by the customer named "William Brown".
select*from film
select* from inventory
select*from rental
select* from customer
select title from film join inventory on inventory.film_id=film.film_id join rental on 
rental.inventory_id=inventory.inventory_id join customer on 
rental.customer_id=customer.customer_id where first_name='william' and last_name='brown'