
-- Assignment 3: Aggregated View
-- Create a view named monthly_rental_stats that displays the month, year, and the total number of rentals for each month in the rental table.

select* from rental


-- create view
  create OR REPLACE  view monthly_rental_stats  
  as
   select month(rental_date) as 'month',year(rental_date) as 'year' ,count(rental_id) as 'rental count' from rental 
   
--  Retrive the data from view
 select * from monthly_rental_stats
 
-- Drop/delete view
drop view monthly_rental_stats