
 
 -- (17) 	Get the film titles and rental dates for all rentals made on October 20, 2005.

   select* from customer
   select* from rental 
   select*from inventory 
   select*from film
   
select title from film join inventory on film.film_id=inventory.film_id 
  join rental on rental.inventory_id=inventory.inventory_id 
  where rental_date="2005-10-20"
  
 
0	49	11:47:31	select rental_date,return_date from film join inventory on film.film_id=inventory.film_id 
   join rental on rental.inventory_id=inventory.inventory_id join customer 
   on customer.customer_id=rental.customer_id where customer.first_name"Mary" and customer.last_name="Harris"	Error Code: 1064. You have an error in your SQL syntax; check 
   the manual that corresponds to your MySQL server version for the right syntax 
   to use near '"Mary" and customer.last_name="Harris"' at line 3	0.000 sec