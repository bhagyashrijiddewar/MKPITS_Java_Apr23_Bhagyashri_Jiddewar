
 
 -- (12) Display the film titles rented by the customer with customer_id 300.

  select*from film  
  select*from inventory 
  select * from rental    
  select* from customer
  
  select title from film join inventory on 
  inventory.film_id=film.film_id join rental on 
  rental.inventory_id=rental.inventory_id join customer on 
  customer.customer_id=rental.customer_id where customer.customer_id='300'
 
