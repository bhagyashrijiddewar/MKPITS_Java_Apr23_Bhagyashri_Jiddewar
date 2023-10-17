
-- Assignment 1

select* from film

-- create view
  create OR REPLACE  view film_titles  
  as
   select film_id,title,release_year from film  
   
--  Retrive the data from view
 select * from film_titles
 
-- Drop/delete view
drop view film_titles