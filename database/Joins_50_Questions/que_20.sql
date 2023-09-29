
 
 -- (20) Display the rental date and rental duration for each rental made by customer
 -- "Karen Smith".

    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
 select rental_date,rental_duration from rental join customer 
 on customer.customer_id=rental.customer_id join inventory on
 inventory.inventory_id=rental.inventory_id join film on 
 film.film_id=inventory.film_id 
 
  

