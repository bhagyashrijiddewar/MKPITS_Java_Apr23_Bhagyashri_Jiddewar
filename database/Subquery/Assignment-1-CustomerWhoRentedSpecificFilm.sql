
-- Assignment 1: Find customers who rented a specific film:
-- Retrieve the names of customers who rented the film with the title 'Inception'.

select* from customer
select* from film
select* from 

select first_name,last_name from customer join rental on rental.customer_id=customer.customer_id
 join inventory on inventory.inventory_id=rental.inventory_id join film on film.film_id=inventory.film_id
 where title="ACADEMY DINOSAUR"