
 
 -- (17) List the names of customers who have rented the film titled "Silence Kane".

    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
  
  select first_name,last_name from customer left join rental on 
  rental.customer_id=customer.customer_id join inventory on 
  inventory.inventory_id=rental.inventory_id join film on film.film_id= inventory.film_id 
  where title="Silence Kane"
  

 