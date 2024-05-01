CREATE database Mysql_Joins;
use Mysql_Joins;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    address_id INT);
    
    INSERT INTO customers (customer_id, first_name, last_name, email, address_id) VALUES
(1, 'Mary', 'Smith', 'mary.smith@mailid.com', 5),
(2, 'Patricia', 'Johnson', 'patricia.johnson@mailid.com', 6),
(3, 'Madan', 'Mohan', 'madan.mohan@mailid.com', 7),
(4, 'Barbara', 'Jones', 'barbara.jones@mailid.com', 8),
(5, 'Elizabeth', 'Brown', 'elizabeth.brown@mailid.com', 9),
(6, 'Jennifer', 'Davis', 'jennifer.davis@mailid.com', 10),
(7, 'Maria', 'Miller', 'maria.miller@mailid.com', 11),
(8, 'Susan', 'Wilson', 'susan.wilson@mailid.com', 12),
(9, 'R', 'Madhav', 'r.madhav@mailid.com', 13);


CREATE TABLE payments (
    customer_id INT,
    amount DECIMAL(10, 2),
    mode VARCHAR(50),
    payment_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);


INSERT INTO payments (customer_id, amount, mode, payment_date) VALUES
(1, 60, 'Cash', '2020-09-24'),
(2, 30, 'Credit Card', '2020-04-27'),
(3, 90, 'Credit Card', '2020-07-07'),
(4, 50, 'Debit Card', '2020-02-12');




