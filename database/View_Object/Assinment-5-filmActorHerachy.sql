
-- Assignment 5: Hierarchical View
-- Create a hierarchical view named film_actors_hierarchy that displays the film title and the actors for each film, 
-- organized in a hierarchical structure, using the film and actor tables.


select* from film
select* from film_actor
select* from actor

-- create view
  create OR REPLACE  view film_actors_hierarchy  
  as
   select title,first_name,last_name from film join film_actor on film.film_id=film_actor.film_id 
   join actor on actor.actor_id=film_actor.actor_id
   
--  Retrive the data from view
 select * from film_actors_hierarchy
 
-- Drop/delete view
drop view film_actors_hierarchy