use sakila
 
 -- (9) Highly rented films: Identify films that have been rented more than 30 times.
  
   select* from rental -- inventory_id
   select* from inventory -- film_id,inventory_id
   select* from film -- 
   
   select film.film_id,title,count(rental_id) as "rental_count" 
   from rental join inventory on rental.inventory_id=inventory.inventory_id
   join film on film.film_id=inventory.film_id 
   group by film_id
   having count(rental_id)>30
    
  
  

  
  