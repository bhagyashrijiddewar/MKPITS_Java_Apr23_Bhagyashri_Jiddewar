
 
 -- (19) List the rental date and return date for all rentals made by customer "Donald Davis".


   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
select rental_date,return_date from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id join customer 
  on customer.customer_id=rental.customer_id where first_name="Donald" and last_name="Davis"
  
 
0	49	11:47:31	select rental_date,return_date from film join inventory on film.film_id=inventory.film_id 
   join rental on rental.inventory_id=inventory.inventory_id join customer 
   on customer.customer_id=rental.customer_id where customer.first_name"Mary" and customer.last_name="Harris"	Error Code: 1064. You have an error in your SQL syntax; check 
   the manual that corresponds to your MySQL server version for the right syntax 
   to use near '"Mary" and customer.last_name="Harris"' at line 3	0.000 sec