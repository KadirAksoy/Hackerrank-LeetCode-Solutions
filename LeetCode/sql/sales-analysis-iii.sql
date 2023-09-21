# Write your MySQL query statement below
select p.product_id, p.product_name
from Product p
WHERE p.product_id IN (SELECT s.product_id FROM Sales s
          WHERE sale_date BETWEEN '2019-01-01' AND '2019-03-31')
AND p.product_id NOT IN (SELECT s.product_id FROM Sales s
          WHERE sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31')