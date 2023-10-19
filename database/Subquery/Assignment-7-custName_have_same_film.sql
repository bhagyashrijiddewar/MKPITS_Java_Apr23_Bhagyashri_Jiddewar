
-- Assignment 7:  Find customers who have rented from both stores:
-- Identify customers who have rented films from both store_id 1 and store_id 2.

select* from rental -- customer_id
select* from customer -- store_id
select * from store

select first_name,last_name from rental as r join customer as c on 
r.customer_id=c.customer_id
where store_id in (1,2)



 
 

 
 
 
 
 


