
 
 -- (15) Retrieve the rental date and return date for each rental made by customer
 -- "Richard Davis".
   
   select*from inventory 
   select* from rental 
   select* from customer
   
  select rental_date,return_date from rental left join inventory on 
  inventory.inventory_id=inventory.inventory_id join customer on 
  customer.customer_id=rental.customer_id 
  where customer.first_name='Richard' and customer.last_name='Davis'
 
   select title,rental_date from film join inventory on 
   inventory.film_id=inventory.film_id join rental on 
   rental.inventory_id=rental.inventory_id join customer on 
   customer.customer_id=inventory.customer_id 
   where customer.customer_id=400
 LIMIT 0, 1000	Error Code: 1054. Unknown column 'inventory.customer_id' in 'on clause'	0.000 sec
