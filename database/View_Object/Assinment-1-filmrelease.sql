
-- Assignment 1: Basic View Creation
-- Create a view named film_titles that displays the film_id, title, and release_year for all films in the Sakila database.

select* from film

-- create view
  create OR REPLACE  view film_titles  
  as
   select film_id,title,release_year from film  
   
--  Retrive the data from view
 select * from film_titles
 
-- Drop/delete view
drop view film_titles