use sakila
 
 -- (5)  Actors in popular films: Show actors who have appeared in more than 10 films.
  
   select* from actor -- actor_id
   select* from film_actor -- actor_id,film_id
   select* from film -- language_id,film_id
   -- ============ create a store procedure ============
   Delimiter //
   create procedure sp_actor()
   begin
   
   select actor.actor_id,first_name,last_name,count(film.film_id) as "actor name more than 10 films"
   from actor join film_actor on film_actor.actor_id=actor.actor_id join
   film on film.film_id=film_actor.film_id 
   group by actor_id having count(film.film_id) >20;
   
   end
  //
  delimiter ;
  
  -- ============ call store procedure =================
  call sp_actor
    
  
  

  
  