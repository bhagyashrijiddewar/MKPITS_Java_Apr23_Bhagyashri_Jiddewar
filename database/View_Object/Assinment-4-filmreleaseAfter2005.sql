
-- Assignment 4: Conditional View
-- Create a view named new_release_films that displays the film_id, title, and release_year for films released after the year 2005.

select* from film

-- create view
  create OR REPLACE  view new_release_film 
  as
   select film_id,title,release_year from film  where release_year>2005
   
--  Retrive the data from view
 select * from new_release_film
 
-- Drop/delete view
drop view new_release_film