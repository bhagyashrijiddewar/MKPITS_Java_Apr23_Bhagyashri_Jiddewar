
 
 -- (11) List the film titles and rental dates for all rentals made by customer 
 -- "Mary Johnson".

  select*from film  
  select*from inventory 
  select * from rental    
  select* from customer
  
  select title,rental_date from film join inventory on 
  inventory.film_id=film.film_id join rental on 
  rental.inventory_id=rental.inventory_id join customer on 
  customer.customer_id=rental.customer_id where first_name='mary' and last_name='johnson'
 
