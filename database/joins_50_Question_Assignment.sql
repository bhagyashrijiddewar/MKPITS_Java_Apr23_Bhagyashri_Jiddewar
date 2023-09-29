
use sakila
show tables
//-(1) Retrieve the names of all customers and the titles of the films they have rented.
select* from customer
select* from rental
select* from inventory
select* from film
select first_name,last_name,title from customer join rental on 
customer.customer_id=rental.customer_id join inventory on rental.
//-question (2) Display the rental date and return date for each rental along with the customers first name and last name. ----------------------------
select* from rental
select* from customer
select rental_date,return_date, first_name ,last_name from  
rental join customer on customer.customer_id=rental.customer_id

//-question (3) List the names of actors who have appeared in the film titled "Chamber Italian".-----
select*from actor
select*from film
select*from film_category
//-question (4) Get the titles of all films rented by the customer named "William Brown".

select* from customer
select*from film
select*from rental
//(5) Retrieve the film titles rented by the customer with customer_id 100.
select * from rental     
select*from film         
select*from inventory        
select title from film join inventory on film.film_id=inventory.film_id join customer on 


                                
                          
                                  
                                  
                                  
                                  
                                  
                                  
                                  