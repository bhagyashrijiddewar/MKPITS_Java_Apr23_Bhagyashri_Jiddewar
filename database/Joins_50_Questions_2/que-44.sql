use sakila
 
 -- (44) Display the names of customers who have rented the film titled "Intrigue Worst".

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
select first_name,last_name from customer join rental on customer.customer_id=rental.customer_id
  join inventory on inventory.inventory_id=rental.inventory_id join film on film.film_id=inventory.film_id 
  where title="Intrigue Worst"