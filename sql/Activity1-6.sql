REM   Script: Session 01
REM   session1

Create Table salesman(salesman_id int, name varchar(20), city varchar(20), commission int);

Describe salesman


select * from salesman;

INSERT INTO salesman VALUES('5002', 'Nail Knite', 'Paris ', '13');

INSERT INTO salesman VALUES 
    ('5001', 'James Hoog', 'New york', '15'), 
    ('5005', 'Pit Alex', 'London', '11'),  
    ('5006', 'McLyon', 'Paris', '14'),  
    ('5007', 'Paul Adam', 'Rome', '13'), 
    ('5003', 'Lauson Hen', 'San Jose', '12');

select * from salesman;

INSERT INTO salesman VALUES ('5001', 'James Hoog', 'New york', '15');

INSERT INTO salesman VALUES ('5005', 'Pit Alex', 'London', '11');

INSERT INTO salesman VALUES ('5006', 'McLyon', 'Paris', '14');

select * from salesman;

INSERT INTO salesman VALUES ('5007', 'Paul Adam', 'Rome', '13');

INSERT INTO salesman VALUES ('5003', 'Lauson Hen', 'San Jose', '12');

select * from salesman;

select salesman_id, city from salesman;

select * from salesman where city='Paris';

update salesman set city='Paris' where salesman_id='5002';

select * from salesman where city='Paris';

select salesman_id, commission from salesman where name='Paul Adam';

Alter table salesman add grade int;

select * from salesman;

update salesman set grade='100';

select * from salesman;

update salesman set grade='200' where city='Rome';

update salesman set grade='300' where name='James Hoog';

update salesman set name='Pierre' where name='McLyon';

select * from salesman;

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

select DISTINCT  salesman_id from orders;

select order_no,order_date from orders order by order_date ASC;

select order_no, purchase_amount from orders order by purchase_amount desc;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

