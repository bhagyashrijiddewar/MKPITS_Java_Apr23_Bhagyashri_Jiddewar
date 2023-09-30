
 -- Display the film titles rented by the customer with customer_id 1300.

    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
-- create view
  create OR REPLACE  view vw_film
  as
   select title,first_name,rental_date from film join inventory
   on inventory.film_id=film.film_id join rental
   on rental.inventory_id=inventory.inventory_id join customer 
   on customer.customer_id=rental.customer_id  where customer.customer_id=300	

-- Retrive the data from view
 select * from vw_film
 
-- Drop/delete view
drop view vw_actor

-- Display description of the view
desc vw_film

-- Display the code of the view
select definition from vw_film where vw_film=vw_film('sakila')



