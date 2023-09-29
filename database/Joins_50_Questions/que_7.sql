//(7) Display the film titles and rental durations for all rentals made on May 15, 2005.
select*from film  
select*from inventory 
select * from rental     

select title,rental_duration from film join inventory on film.film_id=inventory.film_id join 
rental on rental.inventory_id=inventory.inventory_id
 where date(rental_date)='2005-05-15'
 
