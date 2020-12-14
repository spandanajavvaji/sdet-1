REM   Script: Session 03
REM   Activity7-9

create table orders(   
    order_no int primary key, purchase_amount float, order_date date,   
    customer_id int, salesman_id int);

INSERT ALL   
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)    
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)   
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)   
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)   
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)   
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)   
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)   
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)   
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)   
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)   
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)   
SELECT 1 FROM DUAL;

select sum(purchase_amount) as "TotalSum" from orders;

select avg(purchase_amount) as "Avgamount" from orders;

select Max(purchase_amount) as "MaxAmount" from orders;

select Min(purchase_amount) as "MinAmount" from orders;

select count(distinct salesman_id) as "totalcount" from orders;

select customer_id, max(purchase_amount) as "MaxAmount" from orders group by customer_id;

select salesman_id, order_date, max(purchase_amount) as "HighestAmount" from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY  
salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values (3002, 'Nick Rimando', 'New York', 100, 5001);

insert into customers values (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values (3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values (3008, 'Julian Green', 'London', 300, 5002);

insert into customers values (3004, 'Fabian Johnson', 'Paris', 300, 5006);

insert into customers values (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

insert into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

insert into customers values  (3001, 'Brad Guzan', 'London', 300, 5005);

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

Create table salesman(salesman_id int, name varchar(20), city  varchar(20), commission int);

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5001', 'James Hoog', 'New York ', '15');

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5002', 'Nail Knite', 'Paris ', '13');

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5005', 'Pit Alex ', 'London ', '11');

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5006', 'McLyon', 'Paris ', '14');

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5007', 'Paul Adam', 'Rome ', '13');

INSERT INTO salesman(salesman_id, name, city,commission) VALUES('5003', 'Lauson Hen', 'San Jose', '12');

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id  
WHERE b.commission>12;

select a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

select * FROM orders where salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

select * FROM orders where salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

