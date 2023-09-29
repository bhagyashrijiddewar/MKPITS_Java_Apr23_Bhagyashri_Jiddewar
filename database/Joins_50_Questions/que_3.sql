//-question (3) List the names of actors who have appeared in the film titled "Chamber Italian".-----
select*from actor
select*from film_actor
select*from film
select first_name,last_name from actor join film_actor on 
actor.actor_id=film_actor.actor_id join film on film.film_id=film_actor.film_id 
where title="Chamber Italian"