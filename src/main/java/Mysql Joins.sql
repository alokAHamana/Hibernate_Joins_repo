
#Inner jois
Select c.customer_id, c.first_name , p.amount , p.mode from customers As c
INNER JOIN payments As p
ON c.customer_id=p.customer_id;

#Left joins
select *
from customers As c
Left JOIN payments As p
ON c.customer_id=p.customer_id;

#Right joins

select *
from customers As c
Right JOIN payments As p
ON c.customer_id=p.customer_id;


#Cross joins

select *
from customers As c
Cross JOIN payments As p
ON c.customer_id=p.customer_id;

