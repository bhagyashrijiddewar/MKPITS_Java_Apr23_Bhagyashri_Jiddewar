
-- Assignment 4: Find the average rental duration compared to the overall average:
-- Compare the average rental duration of films in a specific category with the overall average
-- rental duration.

select* from film
select* from film_category
select* from category

 select avg(rental_duration) as 'Average of category',
 (select avg(rental_duration) as 'Overall Average' from film) from film
 where film_id in(select film_id from film_category 
 where category_id in (select category_id from category where category_id=1))
 
 
 
 
 
 


