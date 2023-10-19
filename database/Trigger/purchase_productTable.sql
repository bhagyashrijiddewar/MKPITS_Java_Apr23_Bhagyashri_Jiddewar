-- create a table for storing the data from cursor which is fetched from database by using explicit cursor

use sakila
show tables

-- -------------------create a product table---------------------------------------
create table productTable(prod_id int ,
					product_name varchar(15),
                    price int,
                    quantity int)

-- ------------------------insert the values in the table--------------------------------------
insert into productTable (prod_id,product_name,price,quantity) 
              values (101,'toothbrush',20,50)
              
-- --------------------------display table data----------------------------------------------
select * from productTable

-- -------------------create the sale table-------------------------------------

create table saleTable(sale_id int ,
					prod_id int,
					quantity int
                    );

-- -------------create a trigger on saleTable---------------------------------------------
Delimiter //
CREATE TRIGGER after_sale_insert 
    after insert ON saleTable
    FOR EACH ROW 
begin
update productTable
set quantity=quantity-new.quantity
where prod_id=new.prod_id;
end
//
Delimiter ;

-- ----------------Insert the data in the saleTable means fire the trigger-------------------

insert into saleTable (sale_id,prod_id,quantity) 
              values (100,101,5)
              
-- -------------------create the purchase table-------------------------------------

create table PurchaseTable(purchase_id int ,
					prod_id int,
					quantity int
                    );

-- -------------create a trigger on purchaseTable--------------------
Delimiter //
CREATE TRIGGER after_purchase_insert 
    after insert ON PurchaseTable
    FOR EACH ROW 
begin
update productTable
set quantity=quantity+new.quantity
where prod_id=new.prod_id;
end
//
Delimiter ;

-- --------------------Drop the trigger----------------------------------------
drop trigger after_purchase_insert

-- ----------------Insert the data in the PurchaseTable means fire the trigger-------------------

insert into PurchaseTable (purchase_id,prod_id,quantity) 
              values (2,101,20)
              
select* from PurchaseTable
select* from productTable